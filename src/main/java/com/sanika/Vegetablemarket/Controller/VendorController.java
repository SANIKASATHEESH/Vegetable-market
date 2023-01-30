package com.sanika.Vegetablemarket.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanika.Vegetablemarket.DAO.AddressDAO;
import com.sanika.Vegetablemarket.DAO.VendorCategoryDAO;
import com.sanika.Vegetablemarket.DAO.VendorDAO;
import com.sanika.Vegetablemarket.Model.Address;
import com.sanika.Vegetablemarket.Model.VendorCategory;
import com.sanika.Vegetablemarket.Model.VendorEntity;

@Controller
public class VendorController {

	@Autowired
	private VendorDAO vendorDAO;
	
	@Autowired
	AddressDAO addressDAO;
	
	@Autowired
	VendorCategoryDAO venCatDAO;
	
	@GetMapping("/vendors")
	public String getAllVendor(Model m) {
		
		return "AddVendor";
	}
	
	@PostMapping(value="/saveVendor")
	public String saveVendor(HttpServletRequest req) {
		
		String houseName = req.getParameter("houseName");
		String street = req.getParameter("street");
		String postOffice = req.getParameter("postOffice");
		String district = req.getParameter("district");
		String state = req.getParameter("state");
		Long   pinCode = Long.parseLong(req.getParameter("pinCode"));
		
		Address address = new Address();
		
		address.setHouseName(houseName);
		address.setStreet(street);
		address.setPostOffice(postOffice);
		address.setDistrict(district);
		address.setState(state);
		address.setPinCode(pinCode);
		Address savedAddress = addressDAO.save(address);
		
		Long vendorCategoryId = Long.parseLong(req.getParameter("vendorCategoryId"));
		VendorCategory venCat = venCatDAO.getReferenceById(vendorCategoryId);
		
		String vendorName = req.getParameter("vendorName");
		String vendorPassword = req.getParameter("vendorPassword");
		String vendorUserType = req.getParameter("vendorUserType");
		
		VendorEntity vendor = new VendorEntity();
		vendor.setAddress(savedAddress);
		vendor.setVendorCategory(venCat);
		vendor.setVendorName(vendorName);
		vendor.setVendorPassword(vendorPassword);
		vendor.setVendorUserType(vendorUserType);
		
		vendorDAO.save(vendor);
		return "AdminHome";
	}

	@GetMapping(value="/AddVendor")
	public String addVendor() {
		return "AddVendor";
	}
	@GetMapping(value="/UserTypes")
	public ResponseEntity<Map<String,String>>getVendorUserTypes(){
		Map<String,String>userTypes = new HashMap<String,String>();
		userTypes.put(VendorEntity.USERTYPE_INDIVIDUAL,VendorEntity.USERTYPE_INDIVIDUAL);
		userTypes.put(VendorEntity.USERTYPE_ORGANIZATION,VendorEntity.USERTYPE_ORGANIZATION);
		return ResponseEntity.ok(userTypes);
	}
}

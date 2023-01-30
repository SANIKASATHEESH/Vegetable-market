package com.sanika.Vegetablemarket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanika.Vegetablemarket.DAO.VendorCategoryDAO;
import com.sanika.Vegetablemarket.Model.VendorCategory;

@Controller
public class VendorCategoryController {

	@Autowired
	VendorCategoryDAO venCatDAO;
	
	@GetMapping("/vendorCategory")
	public String getAllVendorCategory(Model m) {
		
		return "AddVendorCategory";
	}
	
	@PostMapping("/saveVendorCategory")
	public String saveVendorCategory(VendorCategory venCategory) {
		VendorCategory veCategory=venCatDAO.save(venCategory);
		if(veCategory.getVendorCategoryId()!=null) {
			
			return "AdminHome";
		}
		else {
			return "Error";
		}
	}
}

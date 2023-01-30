package com.sanika.Vegetablemarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanika.Vegetablemarket.DAO.UserDAO;
import com.sanika.Vegetablemarket.Model.UserEntity;


@Controller
public class LoginController {
	
	@Autowired
	private UserDAO userDAO;
	@GetMapping("/")
	public String getAllUser(Model m) {
		List<UserEntity>us = userDAO.findAll();
		return "index";
	}

	@PostMapping("/login")
	public String userLogin(@RequestParam String username,@RequestParam String password) {
		
		UserEntity user = userDAO.getUserByUsernameAndPassword(username, password);
		if(user!=null) {
			System.out.println("user found");
			if(user.getUsertype().equals(UserEntity.USERTYPE_ADMIN)) {
				return "AdminHome";
			}
			else if(user.getUsertype().equals(UserEntity.USERTYPE_USER)) {
				return "BackOfficeHome";
			}
		}else {
			System.out.println("inside else");
			return "Error";
		}
		return username;
	}
}

package com.sanika.Vegetablemarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanika.Vegetablemarket.DAO.UserDAO;
import com.sanika.Vegetablemarket.Model.UserEntity;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/user")
	public String getAllUser(Model m) {
		List<UserEntity>us=userDAO.findAll();
		
		return "AddUser";
	}
	
	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		
		List<UserEntity> usersList = userDAO.findAll();
		
		model.addAttribute("usersList",usersList);
		
		return "ViewAllUsers";
		}
	
	@GetMapping("/id")
	public UserEntity getUserById(@PathVariable long id) {
		
		UserEntity user = userDAO.getReferenceById(id);
		
		return user;
		}
	@PostMapping("/saveUser")
	public String updateUser(UserEntity user) {
		UserEntity user1 = userDAO.save(user);
		if(user1.getId()!=null) {
			return "AddUser";
		}
		else {
				return "Error";
		}
	}
	
	@GetMapping("/deleteUser/id")
	public String deleteUser(@PathVariable long id) {
		
		UserEntity user = userDAO.getReferenceById(id);
		userDAO.delete(user);
		return "AdminHome";
	}
	
	@GetMapping("/editUser/id")
	public String editUser(@PathVariable long id,Model model) {
		
		UserEntity user = userDAO.getReferenceById(id);
		model.addAttribute("user",user);
		
		String[] userTypes = new String[2];
		userTypes[0] = UserEntity.USERTYPE_ADMIN;
		userTypes[1] = UserEntity.USERTYPE_USER;
		
		model.addAttribute("userTypes",userTypes);
		return "EditUser";
	}
	
	@PostMapping("/updateUser")
	public String updateUsers(UserEntity user) {
		
		userDAO.save(user);
		return "AdminHome";
	}
}
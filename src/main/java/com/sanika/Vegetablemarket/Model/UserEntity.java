package com.sanika.Vegetablemarket.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
public class UserEntity {
	
	public static final String USERTYPE_ADMIN = "ADMIN";
	public static final String USERTYPE_USER = "USER";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	 Long id;
	
	@Column(name = "name")
	 String username;
	
	@Column(name = "password")
	 String password;
	
	@Column(name = "usertype")
	 String usertype;
	
	public UserEntity() {

	}
	
	public UserEntity(String username, String password, String usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
}
	

package com.sanika.Vegetablemarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.Vegetablemarket.Model.UserEntity;

public interface UserDAO extends JpaRepository<UserEntity,Long>{

	UserEntity getUserByUsernameAndPassword(String username, String password);
}
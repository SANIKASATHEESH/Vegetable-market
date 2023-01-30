package com.sanika.Vegetablemarket.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.Vegetablemarket.Model.VendorEntity;

public interface VendorDAO extends JpaRepository<VendorEntity,Long> {

}

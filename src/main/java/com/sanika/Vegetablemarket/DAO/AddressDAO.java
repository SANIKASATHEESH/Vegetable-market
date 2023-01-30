package com.sanika.Vegetablemarket.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sanika.Vegetablemarket.Model.Address;

public interface AddressDAO extends JpaRepository<Address,Long> {

}

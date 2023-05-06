package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.RegistrationModel;

@Repository
public interface RegistrationRepo extends JpaRepository<RegistrationModel,Integer>{

}

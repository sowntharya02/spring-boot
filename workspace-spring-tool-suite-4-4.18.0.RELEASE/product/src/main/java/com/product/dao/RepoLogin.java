package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ModelLogin;

public interface RepoLogin extends JpaRepository<ModelLogin,Integer>{
	ModelLogin findByuname(String uname);

	
}

package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.viva;

@Repository
public interface vivaRepository extends JpaRepository <viva,Integer> {

}

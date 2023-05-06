package com.studentdetails.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentdetails.demo.model.ClassModel;

@Repository
public interface StudentRepository extends JpaRepository<ClassModel,Integer> {

}

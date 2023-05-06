package com.studentdetails.demo.service;

import java.util.List;

import com.studentdetails.demo.model.ClassModel;
import com.studentdetails.demo.repository.StudentRepository;



public class ClassService {
	
	StudentRepository studsRepository;
	public List<ClassModel> getAllStudents(){
		List<ClassModel> studsList = studsRepository.findAll();
		return studsList;
	}
	

}

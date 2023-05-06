package com.studentdetails.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetails.demo.model.ClassModel;
import com.studentdetails.demo.service.ClassService;
@RestController
public class StudentController{
	@Autowired
	ClassService studsService;
	@GetMapping("/snap")
	public List<ClassModel> getAllStudents()
	{
		List<ClassModel> studsList = studsService.getAllStudents();
		return studsList;
	}
}
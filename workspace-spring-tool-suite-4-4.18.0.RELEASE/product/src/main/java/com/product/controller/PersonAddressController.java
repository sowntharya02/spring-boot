package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Person;
import com.product.service.PersonAddressService;

@RestController
public class PersonAddressController {
	@Autowired
	PersonAddressService obj;
	public List<Person> fetchAllPersons()

	   {

		  return obj.fetchAllPersons();

	   }

	   @PostMapping("/saveAlldata")

	   public Person savePersons(@RequestBody Person p)

	   {

		   return obj.savePersons(p);

	   }

}

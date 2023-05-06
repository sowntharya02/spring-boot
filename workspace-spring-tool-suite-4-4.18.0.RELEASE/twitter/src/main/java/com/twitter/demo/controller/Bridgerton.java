package com.twitter.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bridgerton {
	@GetMapping("/login/{username}")
	public String login(@PathVariable("username") String username)
	{
		return "thispage is used by "+username;
	}
	

}

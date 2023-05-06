package com.example.twitterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterDemoApplication {
@GetMapping("/login")
	public String twitterlogin()
	{
		return "Login Successful";
	}
}

package com.netflix.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Riverdale {
	@GetMapping("/login")
public String login(@RequestParam String username)
{
	return "this is login page of"+username;
}
}

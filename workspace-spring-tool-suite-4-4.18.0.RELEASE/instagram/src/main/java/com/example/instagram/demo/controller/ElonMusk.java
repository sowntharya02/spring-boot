package com.example.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElonMusk {
	@GetMapping("/sign")
	public String sign()
	{
		return "this is signin page";
	}
	@GetMapping("/landing/(username)")
	public String signup(@PathVariable("username") String username )
	{
		return "this is signup page" +username;
	}

}

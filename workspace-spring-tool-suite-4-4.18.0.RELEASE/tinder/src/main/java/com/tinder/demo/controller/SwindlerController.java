package com.tinder.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwindlerController {
	@GetMapping("/use")
	public String getLogin(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("admin") && password.equals("456"))
		{
			return "Login okay";
		}
		else
		{
			return "kelambunga";
		}
	}

}

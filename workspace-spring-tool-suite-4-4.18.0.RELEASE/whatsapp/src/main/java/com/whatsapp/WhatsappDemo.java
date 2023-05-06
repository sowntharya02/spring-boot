package com.whatsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WhatsappDemo {
	@GetMapping("/login")
	public String login() {
		return "vanakkam da mapla";
	}

}

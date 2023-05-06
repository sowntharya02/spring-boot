package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Viva Energy Drink Database",
				version="1.1.2",
				description="Energy Drink Details and Project",
				contact=@Contact(
						name="Sowntharya.S",
						email="sowntharya.sivakumar02@gmail.com"
						)
				)	
		)
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
		

	}

}

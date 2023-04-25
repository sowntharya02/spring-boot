package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.viva;
import com.product.service.vivaService;

@RestController
public class vivaController {
	@Autowired
	vivaService d;
	@GetMapping(value="/fetch")
	public List<viva> getAllValues()
	{
	List<viva> v=d.getAllValues();
	return v;
	}
	@PostMapping(value="/post")
	public viva saveFile(@RequestBody viva p)
	{
		return d.saveFile(p);
		
	}
	@PutMapping(value="/put")
	public viva updateFile(@RequestBody viva p)
	{
		return d.updateFile(p);
		
	}
	@DeleteMapping(value="/delete/{q}")
	public void del(@PathVariable("q")Integer batno)
	{
		d.del(batno);
	}

}

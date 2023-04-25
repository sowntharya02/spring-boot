package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.vivaRepository;
import com.product.model.viva;

@Service
public class vivaService {
	@Autowired
	vivaRepository a;
	public List<viva> getAllValues()
	{
	List<viva> v=a.findAll();
	return v;
	}
	public viva saveFile(viva p)
	{
		viva m=a.save(p);
	     return m;
	}
	public viva updateFile(viva p)
	{
		viva m=a.save(p);
	     return m;
	}
	public void del(int batno)
	{
		a.deleteById(batno);
	}

}

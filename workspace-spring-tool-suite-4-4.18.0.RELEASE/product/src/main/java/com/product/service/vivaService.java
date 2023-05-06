package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.product.dao.vivaRepository;
import com.product.model.viva;

import jakarta.transaction.Transactional;

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
	public List<viva> sort(String manarea)
	{
		return a.findAll(Sort.by(manarea).descending());
	}
	
	public List<viva> paginate(int offset,int pageSize )
	{
		Page<viva> m=a.findAll(PageRequest.of(offset,pageSize));
		return m.getContent();
	}
	public List<viva> paginateAndSorting(int offset,int pageSize,String manarea)
	{
		Page<viva> m=a.findAll(PageRequest.of(offset,pageSize,Sort.by(manarea).descending()));
		return m.getContent();
	}
	public List<viva> fetchVivaByManareaPrefix(String prefix) 
	{
       return a.findByManareaStartingWith(prefix);
	}
    public List<viva> fetchVivaByManareaSuffix(String suffix) 
	{
		return a.findByManareaEndingWith(suffix);
	}
    
    public List<viva> getVivaByManarea(String manarea,String flavour)

	  {

		  return a.getVivaByManarea(manarea,flavour);

	  }

	@Transactional 

	public int deleteVivaByFlavour(String flavour)

	{

   	return a.deleteVivaByFlavour(flavour);

	}

	@Transactional

	public int updateVivaByFlavour(String manarea,String flavour)

	{

		return a.updateVivaByFlavour(manarea,flavour);

	}
	public List<viva> fetchVivaByFlavour(String flavour) {

		

		return a.fetchVivaByFlavour(flavour);

	}
}

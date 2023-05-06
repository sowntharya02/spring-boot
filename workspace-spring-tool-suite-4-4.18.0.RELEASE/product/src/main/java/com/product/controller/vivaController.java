package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public void del(@PathVariable("q")int batno)
	{
		d.del(batno);
	}
	@GetMapping(value="/sort/{manarea}")
	public List<viva> sort(@PathVariable("manarea") String manarea)
	{
		return d.sort(manarea);
	}
	@GetMapping(value="/paginate/{offset}/{pageSize}")
	public List<viva> paginate(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
	{
		return d.paginate(offset, pageSize);
	}
	@GetMapping(value="/pagingAndSortingViva/{offset}/{pageSize}/{manarea}")
	public List<viva> paginateAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize")int pageSize,@PathVariable("manarea") String manarea)
	{
		return d.paginateAndSorting(offset,pageSize,manarea);
	}
	@GetMapping("/fetchPrefix")
	public List<viva> fetchVivaByManareaPrefix(@RequestParam String prefix)
	{
		return d.fetchVivaByManareaPrefix(prefix);
	}
	@GetMapping("/fetchSuffix")
	public List<viva> fetchVivaByManareaSuffix(@RequestParam String suffix)
	{
		return d.fetchVivaByManareaSuffix(suffix);
	}
	
	@DeleteMapping("/deleteVivaByFlavour/{flavour}")

    public String deleteVivaByFlavour(@PathVariable String flavour)

    {

 	   int result =d.deleteVivaByFlavour(flavour);

 	   if(result>0)

 		     return "flavour deleted";

 	   else

 		     return "Problem occured while deleting";

    }

    @PutMapping("/updateVivatByFlavour/{manarea}/{flavour}")

    public String updateVivaByFlavour(@PathVariable String manarea,String flavour)

    {

 	   int res = d.updateVivaByFlavour(manarea,flavour);

 	   if(res>0)

 		      return "flavour updated";

 	   else

 		    return "Problem occured";

    }
    @GetMapping("/fetchVivaByFlavour/{flavour}")

    public List<viva> fetchVivaByFlavour(@PathVariable String flavour)

    {

    	return d.fetchVivaByFlavour(flavour);

    }
}



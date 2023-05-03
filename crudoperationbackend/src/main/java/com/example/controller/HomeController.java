package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Admission;
import com.example.service.ServiceInf;

@RestController
public class HomeController {
	
	@Autowired
	ServiceInf serviceInf;
	
	@PostMapping(value = "save")
	public Admission save(@RequestBody Admission adm)
	{
		Admission a=serviceInf.saveUser(adm);
		return a;
	}
	
	@GetMapping(value = "getAll")
	public Iterable<Admission> getAllData()
	{
		Iterable<Admission> itr=serviceInf.getAllData();
			return itr;
	}
	
	@PutMapping(value="update/{id}")
	public Admission updateData(@RequestBody Admission adm,@PathVariable Integer id)
	{
		Admission a=serviceInf.updateAllData(adm,id);
		return a;
	}
	
	@DeleteMapping(value = "delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		serviceInf.deleteUser(id);
		return "deleted ....";
	}
	
}

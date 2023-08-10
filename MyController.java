package com.Demo.APItestingPostman;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {
	@Autowired
	MyRepository mrepo;
	
	@PostMapping("/onedata")
	public Student save(@RequestBody Student s)
	{
		return mrepo.save(s);
	}
	@PostMapping("/saveall")
	public List<Student> saveall(@RequestBody List<Student>list)
	{
	return mrepo.saveAll(list);
	}
	@GetMapping("/show")
	public List<Student> all()
	{
		return mrepo.findAll();
	}
	@DeleteMapping("/delete/{id}")
	 public String deleteById(@PathVariable("id") int id)
	{
	    return mrepo.deleteById(id);
	 }
	
	@PutMapping("/update")
	public Student update(@RequestBody Student s)
	{
		return mrepo.save(s);
		
	}

}

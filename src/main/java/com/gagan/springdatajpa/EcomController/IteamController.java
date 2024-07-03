package com.gagan.springdatajpa.EcomController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gagan.springdatajpa.EcomModal.Iteam;
import com.gagan.springdatajpa.EcomService.IteamServiceImpl;
import com.gagan.springdatajpa.Exception.ResultNotFoundException;

@RestController
public class IteamController {
	
	@Autowired
	IteamServiceImpl iteamServ;
	
	@PostMapping("/add")
	public void addIteam() {
		iteamServ.addIteam();
	}
	
	@PostMapping("/update")
	public void updateIteam() {
		iteamServ.updateIteam(1);
	}
	
	@GetMapping("/get")
	public List<Iteam> fetchAll() {
		return iteamServ.getIteam();
	}
	
	@PostMapping("/delete")
	public void deleteIteam() {
		iteamServ.deleteIteam(1);
	}
	
	@GetMapping("/custom/{id}")
	public List getIteamByQuantity(@PathVariable(required =false) int id) throws ResultNotFoundException{
		
	List iteam=	iteamServ.getByQant(id);
		
		if(!iteam.isEmpty()) {
			System.out.println(iteam);
			return iteam;
			
		}
		else {
			throw new ResultNotFoundException("No Result Found");
		}
	}

}

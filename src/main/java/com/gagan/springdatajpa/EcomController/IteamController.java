package com.gagan.springdatajpa.EcomController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gagan.springdatajpa.EcomModal.Iteam;
import com.gagan.springdatajpa.EcomService.IteamServiceImpl;

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
	
	@GetMapping("/custom")
	public List<Iteam> getIteamByQuantity(){
		return iteamServ.getByQant();
	}

}

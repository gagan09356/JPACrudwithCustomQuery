package com.gagan.springdatajpa.EcomService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gagan.springdatajpa.EcomDAO.IteamRepo;
import com.gagan.springdatajpa.EcomModal.Iteam;

@Service
public class IteamServiceImpl implements IteamService{

	@Autowired
	IteamRepo iteamRepo;
	
	@Override
	public void addIteam() {
		// TODO Auto-generated method stub
		//Iteam iteam=new Iteam("Dairy Milk","Choc",20.00,1000);
		Iteam iteam=new Iteam();
		iteam.setIteam_Name("colgate");
		iteam.setIteam_Catagory("toothpaste");
		iteam.setIteam_price(10);
		iteam.setQuantity(100);
		iteamRepo.save(iteam);
	}

	@Override
	public void deleteIteam(int id) {
		// TODO Auto-generated method stub
		//Iteam iteam=iteamRepo.getById(id);
		iteamRepo.deleteById(1);
	}

	@Override
	public void updateIteam(int id) {
		// TODO Auto-generated method stub
		Iteam iteam=iteamRepo.getById(id);
		iteam.setIteam_Catagory("pen");
		iteamRepo.save(iteam);
		
	}

	@Override
	public List<Iteam> getIteam() {
		// TODO Auto-generated method stub
		return iteamRepo.findAll();
		// null;
		//iteamRepo.
	}
	
	public List<Iteam> getByQant(){
		List<Iteam> item =iteamRepo.getByQant(100);
		return item;
	}

	
	
}

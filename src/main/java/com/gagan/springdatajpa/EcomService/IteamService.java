package com.gagan.springdatajpa.EcomService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gagan.springdatajpa.EcomModal.Iteam;

@Service
public interface IteamService {

	public void addIteam();
	
	public void deleteIteam(int id);
	
	public void updateIteam(int id);
	
	public List<Iteam> getIteam();
}

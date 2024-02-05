package com.gagan.springdatajpa.EcomDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gagan.springdatajpa.EcomModal.Iteam;

public interface IteamRepo extends JpaRepository<Iteam, Integer>{

	@Query(nativeQuery = true,
			value=
			"Select * from Iteam where quantity = :quant")
	List<Iteam> getByQant(@Param("quant") long qaunt );
}

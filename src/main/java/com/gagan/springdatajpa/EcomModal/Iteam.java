package com.gagan.springdatajpa.EcomModal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Iteam {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String iteam_Name;
	
	@Column
	private String iteam_Catagory;
	
	@Column
	private double iteam_price;
	
	@Column
	private long quantity;

	public String getIteam_Name() {
		return iteam_Name;
	}

	public void setIteam_Name(String iteam_Name) {
		this.iteam_Name = iteam_Name;
	}

	public String getIteam_Catagory() {
		return iteam_Catagory;
	}

	public void setIteam_Catagory(String iteam_Catagory) {
		this.iteam_Catagory = iteam_Catagory;
	}

	public double getIteam_price() {
		return iteam_price;
	}

	public void setIteam_price(double iteam_price) {
		this.iteam_price = iteam_price;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Iteam(String iteam_Name, String iteam_Catagory, double iteam_price, long quantity) {
		super();
		this.iteam_Name = iteam_Name;
		this.iteam_Catagory = iteam_Catagory;
		this.iteam_price = iteam_price;
		this.quantity = quantity;
	}
	
	public Iteam() {}
	
}

package com.pronix.spring.apssaat4.door2door;

import javax.persistence.Entity;

@Entity
public class Audit {

	@javax.persistence.Id
	private int Id;
	private String name;
	
	
	public Audit() {
		super();
	}


	public Audit(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

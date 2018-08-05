package com.winc.exhibits;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exhibit {
	
	@Id
	private int id;
	private String name;
	private int count;
	
//	public Exhibit(int id, String name, int count) {
//		this.id = id;
//		this.name = name;
//		this.count = count;
//	}
	
	public Exhibit(int id, int count) {
		this.id = id;
		this.count = count;
		this.name = "Not Specified";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

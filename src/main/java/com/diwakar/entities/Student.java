package com.diwakar.entities;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Student {
    
	@Id
	private int Id;
	private String name;
	private String branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}

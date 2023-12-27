package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	
	@Id
	private int id;
	private String name;
	private String city;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Demo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
    
}

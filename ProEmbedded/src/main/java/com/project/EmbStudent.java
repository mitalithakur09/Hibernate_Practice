package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmbStudent {
    @Id
    private int id;
	private String name;
	private String city;
	
	
	private EmbCertificate certi;

	public EmbStudent() {
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
    
	

	public EmbCertificate getCerti() {
		return certi;
	}


	public void setCerti(EmbCertificate certi) {
		this.certi = certi;
	}


	@Override
	public String toString() {
		return "EmbStudent [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public EmbStudent(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	
}

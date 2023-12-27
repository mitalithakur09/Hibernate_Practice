package com.project;

import javax.persistence.Embeddable;

@Embeddable
public class EmbCertificate {
  
	private String course;
	private String duration;
	public EmbCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "EmbCertificate [course=" + course + ", duration=" + duration + ", getCourse()=" + getCourse()
				+ ", getDuration()=" + getDuration() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public EmbCertificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
}

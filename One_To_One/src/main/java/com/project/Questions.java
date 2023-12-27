package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;





@Entity
public class Questions {
    @Id
    @Column(name = "question_id")
	private int id;
	private String questions;
	
	@OneToOne
	private Answer ans;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", questions=" + questions + ", ans=" + ans + ", getId()=" + getId()
				+ ", getQuestions()=" + getQuestions() + ", getAns()=" + getAns() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Questions(int id, String questions, Answer ans) {
		super();
		this.id = id;
		this.questions = questions;
		this.ans = ans;
	}
	
	
	
}

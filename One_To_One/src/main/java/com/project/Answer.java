package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name = "answer_id")
	private int id;
	private String answer;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", getId()=" + getId() + ", getAnswer()=" + getAnswer()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Answer(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}
   
}

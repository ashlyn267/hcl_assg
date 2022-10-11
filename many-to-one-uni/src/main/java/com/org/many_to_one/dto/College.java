package com.org.many_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int collegeid;
	private String collegename;
	private String collegeadd;
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegepno) {
		this.collegename = collegepno;
	}
	public String getCollegeadd() {
		return collegeadd;
	}
	public void setCollegeadd(String collegeadd) {
		this.collegeadd = collegeadd;
	}
	
	
	

}

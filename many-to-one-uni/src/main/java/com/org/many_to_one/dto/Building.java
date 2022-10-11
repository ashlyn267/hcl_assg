package com.org.many_to_one.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Building {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int buildingno;
	private String buildingName;
	private String buildingColor;
	@ManyToOne(cascade =CascadeType.PERSIST)
	private College college;
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getBuildingno() {
		return buildingno;
	}
	public void setBuildingno(int buildingno) {
		this.buildingno = buildingno;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingColor() {
		return buildingColor;
	}
	public void setBuildingColor(String buildingColor) {
		this.buildingColor = buildingColor;
	}
	
	
	

}

package org.alvas.many_to_many.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stid;
	private String stname;
	private long stphone;
	@ManyToMany
	private List<Subjects> subj;
	
	public List<Subjects> getSubj() {
		return subj;
	}
	public void setSubj(List<Subjects> subj) {
		this.subj = subj;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public long getStphone() {
		return stphone;
	}
	public void setStphone(long stphone) {
		this.stphone = stphone;
	}
	

}

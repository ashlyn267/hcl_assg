package com.org.many_to_one.controller;

import com.org.many_to_one.dao.CollegeDao;
import com.org.many_to_one.dto.Building;
import com.org.many_to_one.dto.College;

public class CollegeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollegeDao dao=new CollegeDao();
		
		College college=new College();
		Building b1=new Building();
		Building b2=new Building();
		
		college.setCollegename("sdpt");
		college.setCollegeadd("kateel");
		b1.setBuildingName("pu");
		b1.setCollege(college);
		b1.setBuildingColor("cream-red");
		b2.setBuildingName("highschool");
		b2.setCollege(college);
		b2.setBuildingColor("red");
		
		dao.saveBuildingCollege(college, b1, b2);
		

	}

}

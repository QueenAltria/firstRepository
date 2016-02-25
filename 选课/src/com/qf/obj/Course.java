package com.qf.obj;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private Classes cla;
	private List<Student> stuList = new ArrayList<Student>();

	public Course(String courseName, Classes cla) {
		this.courseName = courseName;
		this.cla = cla;
	}
	
	public void addStudent(Student student) {
		stuList.add(student);
	}
	
	public boolean isFull() {
		int currentCount = stuList.size();//已经选择此课程的人数
		int maxCount = cla.getMaxCount();
		
		if(currentCount<maxCount)
			return false;
		
		return true;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	public Classes getCla() {
		return cla;
	}

	public void setCla(Classes cla) {
		this.cla = cla;
	}

	public int getCurrentCount() {
		return stuList.size();
	}

	public void delStudent(Student student) {
		stuList.remove(student);
	}

	

	
}

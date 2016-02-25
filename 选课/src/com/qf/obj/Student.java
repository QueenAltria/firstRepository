package com.qf.obj;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String pwd;
	private List<Course> courseList = new ArrayList<Course>();

	public Student(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	public void showSelectedCourse() {
		if(courseList.size()==0)
		{
			System.err.println("您暂无已选课程");
			return;
		}
		for (Course course : courseList) {
			System.err.println("课程："+course.getCourseName()+" |班级："+course.getCla().getClaName());
		}
		
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void selectCourse(Course course) {
		if(courseList.contains(course))
		{
			System.err.println("您已选择此课程，不能重复选择！");
			return;
		}
		
		boolean isFull = course.isFull();
		if(!isFull)
		{
			courseList.add(course);
			course.addStudent(this);
			System.err.println("选课成功!");
		}else
			System.err.println("此门课程已满员，请选择其他！");
		
	}

	public void delCourse(Course course) {
		if(!courseList.contains(course))
		{
			System.err.println("您未选择此课程！");
			return;
		}
		courseList.remove(course);
		course.delStudent(this);
		System.out.println("删除课程成功");
	}

	
}

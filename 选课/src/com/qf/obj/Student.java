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
			System.err.println("��������ѡ�γ�");
			return;
		}
		for (Course course : courseList) {
			System.err.println("�γ̣�"+course.getCourseName()+" |�༶��"+course.getCla().getClaName());
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
			System.err.println("����ѡ��˿γ̣������ظ�ѡ��");
			return;
		}
		
		boolean isFull = course.isFull();
		if(!isFull)
		{
			courseList.add(course);
			course.addStudent(this);
			System.err.println("ѡ�γɹ�!");
		}else
			System.err.println("���ſγ�����Ա����ѡ��������");
		
	}

	public void delCourse(Course course) {
		if(!courseList.contains(course))
		{
			System.err.println("��δѡ��˿γ̣�");
			return;
		}
		courseList.remove(course);
		course.delStudent(this);
		System.out.println("ɾ���γ̳ɹ�");
	}

	
}

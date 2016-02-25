package com.qf;

import java.util.ArrayList;
import java.util.List;

import com.qf.obj.Student;

public class StudentManager {
	private List<Student> stuList;

	public StudentManager() {
		initStudents();
	}
	
	public void initStudents() {
		stuList = new ArrayList<Student>();
		stuList.add(new Student("fyt", "123"));
		stuList.add(new Student("mzs", "123"));
		stuList.add(new Student("fxl", "123"));
		stuList.add(new Student("ycz", "123"));
		stuList.add(new Student("lzy", "123"));
	}
	
	public Student login(String name, String pwd) {
		Student stu = null;
		for (Student temp : stuList) {
			if(temp.getName().equals(name) && temp.getPwd().equals(pwd))
			{
				stu = temp;
				break;
			}
		}
		return stu;
	}


	public List<Student> getStuList() {
		return stuList;
	}

	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}

	
}

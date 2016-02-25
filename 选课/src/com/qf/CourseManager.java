package com.qf;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.qf.obj.Classes;
import com.qf.obj.Course;

public class CourseManager {
	private static CourseManager instance = null;
	private Map<String, Course> map = new HashMap<String, Course>();

	private CourseManager(Map<String, Classes> classesMap) {
		map.put("����", new Course("����", classesMap.get("����1��")));
		map.put("��ѧ", new Course("��ѧ", classesMap.get("��ѧ2��")));
		map.put("Ӣ��", new Course("Ӣ��", classesMap.get("Ӣ��3��")));
		map.put("����", new Course("����", classesMap.get("����4��")));
	}

	public static CourseManager initCourse(Map<String, Classes> map) {
		if (null == instance)
			instance = new CourseManager(map);
		return instance;
	}

	public void showCourse() {
		Collection<Course> courseList = map.values();
		for (Course course : courseList) {
			Classes cla = course.getCla();
			System.out.println("�γ�����" + course.getCourseName() + " |�༶���ƣ�" + cla.getClaName() + " |��ʦ��"
					+ cla.getTeacherName() + " |�Ͽ�ʱ�䣺" + cla.getInfo() + " |���ѡ��������" + cla.getMaxCount()+" ��ѡ������:"+course.getCurrentCount());
		}
	}

	public Course getCourseByName(String courseName) {
		return map.get(courseName);		
	}

}

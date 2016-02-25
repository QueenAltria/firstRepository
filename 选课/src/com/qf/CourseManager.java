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
		map.put("语文", new Course("语文", classesMap.get("语文1班")));
		map.put("数学", new Course("数学", classesMap.get("数学2班")));
		map.put("英语", new Course("英语", classesMap.get("英文3班")));
		map.put("生物", new Course("生物", classesMap.get("生物4班")));
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
			System.out.println("课程名：" + course.getCourseName() + " |班级名称：" + cla.getClaName() + " |老师："
					+ cla.getTeacherName() + " |上课时间：" + cla.getInfo() + " |最大选择人数：" + cla.getMaxCount()+" 已选课人数:"+course.getCurrentCount());
		}
	}

	public Course getCourseByName(String courseName) {
		return map.get(courseName);		
	}

}

package com.qf.view;

import java.util.Scanner;

import com.qf.ClassesManager;
import com.qf.CourseManager;
import com.qf.StudentManager;
import com.qf.obj.Course;
import com.qf.obj.Student;

/**
 * 运行系统之前，基础数据准备（用户数据、课程数据、班级数据）
 * 
 * @author Administrator
 *
 */
public class Demo {
	static Scanner sc = new Scanner(System.in);
	static StudentManager sm = new StudentManager();
	static ClassesManager classManager = ClassesManager.initClasses();
	static CourseManager courseManager = CourseManager.initCourse(classManager.getMap());

	public static void main(String[] args) {
		System.err.println("欢迎使用选课系统");

		Student loginUser = login();
		
		System.err.println("登录成功");

		showMenu();

		System.out.println("请选择菜单项：1.2.3.4.5");
		int menu = sc.nextInt();

		do {
			if (menu == 1) {
				courseManager.showCourse();
			} else if (menu == 2) {
				loginUser.showSelectedCourse();
			} else if (menu == 3) {
				Course course = getCourse();
				loginUser.selectCourse(course);
			} else if (menu == 4) {
				Course course = getCourse();
				loginUser.delCourse(course);
			}
			int isBack = isBack();
			if (isBack == 0) {
				System.out.println("请选择菜单项：1.2.3.4.5");
				menu = sc.nextInt();
			}
		} while (menu != 5);
		System.out.println("已退出系统");
	}

	public static Student login() {
		Student loginUser = null;
		do {
			System.err.println("输入用户名：");
			String name = sc.next();
			System.err.println("输入密码：");
			String pwd = sc.next();
			loginUser = sm.login(name, pwd);
			if (null == loginUser)
				System.err.println("用户名或密码错误，请重新登陆！");
		} while (loginUser == null);
		return loginUser;
	}

	public static Course getCourse() {
		System.out.println("请输入课程名称：");
		String courseName = sc.next();
		Course course = courseManager.getCourseByName(courseName);
		return course;
	}

	public static int isBack() {
		System.out.println("是否返回主菜单：0:返回，1：继续本功能");
		int isBack = sc.nextInt();
		if (isBack == 0)
			showMenu();
		return isBack;
	}

	public static void showMenu() {
		System.out.println("----------主菜单-----------");
		System.out.println("1.查看系统课程");
		System.out.println("2.查看个人已选课程");
		System.out.println("3.选择课程");
		System.out.println("4.删除已选课程");
		System.out.println("5.退出系统");
	}
}

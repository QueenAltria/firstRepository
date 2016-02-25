package com.qf.view;

import java.util.Scanner;

import com.qf.ClassesManager;
import com.qf.CourseManager;
import com.qf.StudentManager;
import com.qf.obj.Course;
import com.qf.obj.Student;

/**
 * ����ϵͳ֮ǰ����������׼�����û����ݡ��γ����ݡ��༶���ݣ�
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
		System.err.println("��ӭʹ��ѡ��ϵͳ");

		Student loginUser = login();
		
		System.err.println("��¼�ɹ�");

		showMenu();

		System.out.println("��ѡ��˵��1.2.3.4.5");
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
				System.out.println("��ѡ��˵��1.2.3.4.5");
				menu = sc.nextInt();
			}
		} while (menu != 5);
		System.out.println("���˳�ϵͳ");
	}

	public static Student login() {
		Student loginUser = null;
		do {
			System.err.println("�����û�����");
			String name = sc.next();
			System.err.println("�������룺");
			String pwd = sc.next();
			loginUser = sm.login(name, pwd);
			if (null == loginUser)
				System.err.println("�û�����������������µ�½��");
		} while (loginUser == null);
		return loginUser;
	}

	public static Course getCourse() {
		System.out.println("������γ����ƣ�");
		String courseName = sc.next();
		Course course = courseManager.getCourseByName(courseName);
		return course;
	}

	public static int isBack() {
		System.out.println("�Ƿ񷵻����˵���0:���أ�1������������");
		int isBack = sc.nextInt();
		if (isBack == 0)
			showMenu();
		return isBack;
	}

	public static void showMenu() {
		System.out.println("----------���˵�-----------");
		System.out.println("1.�鿴ϵͳ�γ�");
		System.out.println("2.�鿴������ѡ�γ�");
		System.out.println("3.ѡ��γ�");
		System.out.println("4.ɾ����ѡ�γ�");
		System.out.println("5.�˳�ϵͳ");
	}
}

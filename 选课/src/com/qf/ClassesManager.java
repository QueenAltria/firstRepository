package com.qf;

import java.util.HashMap;
import java.util.Map;

import com.qf.obj.Classes;

public class ClassesManager {
	private static ClassesManager instance = null;
	private Map<String, Classes> map = new HashMap<String, Classes>();

	private ClassesManager() {
		map.put("����1��", new Classes("����1��", "lxa", 50, "��һ����ǰ���ڣ��������������"));
		map.put("��ѧ2��", new Classes("��ѧ2��", "lmm", 20, "�ܶ�����ǰ���ڣ���һ���������"));
		map.put("Ӣ��3��", new Classes("Ӣ��3��", "wy", 10, "��������ǰ���ڣ��ܶ����������"));
		map.put("����4��", new Classes("����4��", "lgq", 5, "��������ǰ���ڣ��������������"));
	}

	public static ClassesManager initClasses() {
		if (null == instance)
			instance = new ClassesManager();
		return instance;
	}

	public Map<String, Classes> getMap() {
		return map;
	}

	public void setMap(Map<String, Classes> map) {
		this.map = map;
	}

}

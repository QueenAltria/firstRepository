package com.qf;

import java.util.HashMap;
import java.util.Map;

import com.qf.obj.Classes;

public class ClassesManager {
	private static ClassesManager instance = null;
	private Map<String, Classes> map = new HashMap<String, Classes>();

	private ClassesManager() {
		map.put("语文1班", new Classes("语文1班", "lxa", 50, "周一上午前两节；周三下午后两节"));
		map.put("数学2班", new Classes("数学2班", "lmm", 20, "周二上午前两节；周一下午后两节"));
		map.put("英文3班", new Classes("英文3班", "wy", 10, "周三上午前两节；周二下午后两节"));
		map.put("生物4班", new Classes("生物4班", "lgq", 5, "周四上午前两节；周五下午后两节"));
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

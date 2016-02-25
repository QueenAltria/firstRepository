package com.qf.obj;

public class Classes {
	private String claName;
	private String teacherName;
	private int maxCount;
	private String info;

	public Classes(String claName, String teacherName, int maxCount, String info) {
		this.claName = claName;
		this.teacherName = teacherName;
		this.maxCount = maxCount;
		this.info = info;
	}

	public String getClaName() {
		return claName;
	}

	public void setClaName(String claName) {
		this.claName = claName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}

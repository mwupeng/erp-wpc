package com.erpSys.main.model;

import java.util.Date;

import com.erpSys.main.utils.HabitUtils;

public class Section {
	private int id;

	private String department;

	private String createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = HabitUtils.DateToStr2(createtime);
	}
}
package com.erpSys.main.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.erpSys.main.utils.HabitUtils;

public class User {

	public User() {
		super();
	}

	private int id;

	private String loginname;

	private String name;

	private String password;

	private String salt;

	private int sex;

	private int age;

	private String phone;

	private Byte status;

	private String organizationid;

	private Integer roleid;

	private String createtime;

	@TableField(exist = false)
	private Userpower powerlist;

	public Userpower getPowerlist() {
		return powerlist;
	}

	public void setPowerlist(Userpower powerlist) {
		this.powerlist = powerlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname == null ? null : loginname.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getOrganizationid() {
		return organizationid;
	}

	public void setOrganizationid(String organizationid) {
		this.organizationid = organizationid == null ? null : organizationid.trim();
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = HabitUtils.DateToStr2(new Date());
	}
}
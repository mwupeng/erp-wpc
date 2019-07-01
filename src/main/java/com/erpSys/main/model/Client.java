package com.erpSys.main.model;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.erpSys.main.utils.HabitUtils;

public class Client {

	public Client() {
		super();
	}

	private int id;

	private String creationtime;

	private String creation;

	private String creationname;

	private String status;

	private int state;

	private String remark;

	private String company;

	private int source;

	private String contact;

	private int contactsex;

	private int contactage;

	private String contactphone;

	private int clientgrade;

	private String contactelse;

	@TableField(exist = false)
	private Clientaddress clientaddress;

	public Clientaddress getClientaddress() {
		return clientaddress;
	}

	public void setClientaddress(Clientaddress clientaddress) {
		this.clientaddress = clientaddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = HabitUtils.DateToStr2(creationtime);
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation == null ? null : creation.trim();
	}

	public String getCreationname() {
		return creationname;
	}

	public void setCreationname(String creationname) {
		this.creationname = creationname == null ? null : creationname.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company == null ? null : company.trim();
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact == null ? null : contact.trim();
	}

	public Integer getContactsex() {
		return contactsex;
	}

	public void setContactsex(Integer contactsex) {
		this.contactsex = contactsex;
	}

	public Integer getContactage() {
		return contactage;
	}

	public void setContactage(Integer contactage) {
		this.contactage = contactage;
	}

	public String getContactphone() {
		return contactphone;
	}

	public void setContactphone(String contactphone) {
		this.contactphone = contactphone == null ? null : contactphone.trim();
	}

	public Integer getClientgrade() {
		return clientgrade;
	}

	public void setClientgrade(Integer clientgrade) {
		this.clientgrade = clientgrade;
	}

	public String getContactelse() {
		return contactelse;
	}

	public void setContactelse(String contactelse) {
		this.contactelse = contactelse == null ? null : contactelse.trim();
	}
}
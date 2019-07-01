package com.erpSys.main.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.erpSys.main.utils.HabitUtils;

public class Clientaddress {
	public Clientaddress() {
		super();
	}

	private int id;

	private String creationtime;

	private String creation;

	private String creationame;

	private String status;

	private Integer state;

	private String remark;

	private Integer clientid;

	private String address;

	private String consignee;

	private String consigneephone;

	@TableField(exist = false)
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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

	public String getCreationame() {
		return creationame;
	}

	public void setCreationame(String creationame) {
		this.creationame = creationame == null ? null : creationame.trim();
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

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee == null ? null : consignee.trim();
	}

	public String getConsigneephone() {
		return consigneephone;
	}

	public void setConsigneephone(String consigneephone) {
		this.consigneephone = consigneephone == null ? null : consigneephone.trim();
	}
}
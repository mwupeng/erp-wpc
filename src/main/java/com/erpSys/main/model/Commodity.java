package com.erpSys.main.model;

import java.util.Date;

public class Commodity {
	private Integer id;

	private String commodityname;

	private Integer inventory;

	private String classify;

	private Double commodityprice;

	private Date inputtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommodityname() {
		return commodityname;
	}

	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname == null ? null : commodityname.trim();
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify == null ? null : classify.trim();
	}

	public Double getCommodityprice() {
		return commodityprice;
	}

	public void setCommodityprice(Double commodityprice) {
		this.commodityprice = commodityprice;
	}

	public Date getInputtime() {
		return inputtime;
	}

	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}
}
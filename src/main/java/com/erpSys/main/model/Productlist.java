package com.erpSys.main.model;

import com.baomidou.mybatisplus.annotations.TableField;

public class Productlist {
	private int id;

	private int salesorderid;

	private int commodityid;

	private int commoditymath;

	private Double price;

	@TableField(exist = false)
	private Commodity commodity;

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalesorderid() {
		return salesorderid;
	}

	public void setSalesorderid(Integer salesorderid) {
		this.salesorderid = salesorderid;
	}

	public Integer getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(Integer commodityid) {
		this.commodityid = commodityid;
	}

	public Integer getCommoditymath() {
		return commoditymath;
	}

	public void setCommoditymath(Integer commoditymath) {
		this.commoditymath = commoditymath;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
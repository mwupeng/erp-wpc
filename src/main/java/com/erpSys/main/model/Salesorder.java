package com.erpSys.main.model;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.erpSys.main.utils.HabitUtils;

public class Salesorder {

	public Salesorder() {
		super();
	}

	private Integer salesorderid;

	private String creation;

	private String creationname;

	private String status;

	private int states;

	private String remark;

	private Integer userid;

	private Integer clientid;

	private String commodityid;

	private Double advance;

	private Integer deliveryid;

	private Integer costid;

	private Double prices;

	private Integer shippingaddress;

	private String creationtime;

	@TableField(exist = false)
	private User user;

	@TableField(exist = false)
	private Client client;

	@TableField(exist = false)
	private Clientaddress clientaddress;

	@TableField(exist = false)
	private Commodity commodity;

	@TableField(exist = false)
	private Productlist productlist;

	public Productlist getProductlist() {
		return productlist;
	}

	public void setProductlist(Productlist productlist) {
		this.productlist = productlist;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Clientaddress getClientaddress() {
		return clientaddress;
	}

	public void setClientaddress(Clientaddress clientaddress) {
		this.clientaddress = clientaddress;
	}

	public Integer getSalesorderid() {
		return salesorderid;
	}

	public void setSalesorderid(Integer salesorderid) {
		this.salesorderid = salesorderid;
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

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getCommodityid() {
		return commodityid;
	}

	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid == null ? null : commodityid.trim();
	}

	public Double getAdvance() {
		return advance;
	}

	public void setAdvance(Double advance) {
		this.advance = advance;
	}

	public Integer getDeliveryid() {
		return deliveryid;
	}

	public void setDeliveryid(Integer deliveryid) {
		this.deliveryid = deliveryid;
	}

	public Integer getCostid() {
		return costid;
	}

	public void setCostid(Integer costid) {
		this.costid = costid;
	}

	public Double getPrices() {
		return prices;
	}

	public void setPrices(Double prices) {
		this.prices = prices;
	}

	public Integer getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(Integer shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public String getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = HabitUtils.DateToStr2(creationtime);
	}
}
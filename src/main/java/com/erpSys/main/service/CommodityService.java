package com.erpSys.main.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Commodity;
import com.erpSys.main.model.Productlist;

public interface CommodityService extends IService<Commodity> {

	/**
	 * 查询所有的商品
	 * 
	 * @return
	 */
	List<Commodity> SelectdbList();

	/**
	 * 根据ID查询实体类
	 * 
	 * @return
	 */
	Commodity SelectdbComm(Integer id);
}

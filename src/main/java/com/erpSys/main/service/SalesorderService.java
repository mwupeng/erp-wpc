package com.erpSys.main.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Productlist;
import com.erpSys.main.model.Salesorder;

public interface SalesorderService extends IService<Salesorder> {
	/**
	 * 查询全部数据
	 * 
	 * @return
	 */
	List<Salesorder> selectList();

	/**
	 * 根据客户id查询
	 * 
	 * @return
	 */
	List<Salesorder> selectByClientId(Integer clientId);

	/**
	 * 计算总价
	 * 
	 * @param id
	 * @return
	 */
	double PriceCommtity(Integer salesorderid);

	/**
	 * 临时存储
	 * 
	 * @return
	 */
	Map<Integer, Productlist> proMap(Integer[] id, Integer[] count, Map<Integer, Productlist> map);

	/**
	 * 临时存储转list
	 * 
	 * @param map
	 * @return
	 */
	List<Productlist> mapList(Map<Integer, Productlist> map);

	/**
	 * 添加数据 返回订单号
	 * 
	 * @param productlist
	 * @return
	 */
	int InserDb(Salesorder salesorder, Map<Integer, Productlist> map);

}

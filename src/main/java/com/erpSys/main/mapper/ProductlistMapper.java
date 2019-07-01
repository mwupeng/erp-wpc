package com.erpSys.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.Productlist;
import com.erpSys.main.model.Salesorder;

@Mapper
public interface ProductlistMapper extends BaseMapper<Productlist> {

	/**
	 * 根据订单号查询查询商品列表
	 * 
	 * @return
	 */
	List<Productlist> Selectcommditylist(Integer salesorderid);
}
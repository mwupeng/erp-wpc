package com.erpSys.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.Salesorder;

import io.lettuce.core.dynamic.annotation.Param;

@Mapper
public interface SalesorderMapper extends BaseMapper<Salesorder> {

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	List<Salesorder> SelectCUList();

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	List<Salesorder> SelectByIdcommlist(@Param("clientid") Integer clientId);

	/**
	 * 添加数据 返回 id主键
	 * 
	 * @param salesorder
	 * @return
	 */
	int InserDb(Salesorder salesorder);
}
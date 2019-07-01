package com.erpSys.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.Client;

@Mapper
public interface ClientMapper extends BaseMapper<Client> {
	/**
	 * 根据姓名查询
	 * 
	 * @param name
	 * @return
	 */
	public List<Client> selectAddress(@Param("name") String name);

	/**
	 * 查询姓名
	 * @return
	 */
	public List<Client> selectName();
}
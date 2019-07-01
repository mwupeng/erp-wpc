package com.erpSys.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.Clientaddress;

import io.lettuce.core.dynamic.annotation.Param;

@Mapper
public interface ClientaddressMapper extends BaseMapper<Clientaddress> {

	/**
	 * 查询对应用户
	 * 
	 * @return
	 */
	public List<Clientaddress> selectClient();

	/**
	 * 根据id查询地址
	 * 
	 * @return
	 */
	public List<Clientaddress> selectClientByid(@Param("id") Integer id);
}
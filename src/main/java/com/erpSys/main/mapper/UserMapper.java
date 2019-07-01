package com.erpSys.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

	public List<User> selectByPower();
}
package com.erpSys.main.servive.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.UserMapper;
import com.erpSys.main.model.User;
import com.erpSys.main.service.UserService;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public PageInfo<User> selectByPage(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<User> userlist = userMapper.selectByPower();
		PageInfo<User> page = new PageInfo<User>(userlist);
		return page;
	}

	@Override
	public boolean UserInsert(User user) {
		boolean judeg = insert(user);
		return judeg;
	}

	@Override
	public boolean UserDel(Integer id) {
		EntityWrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.eq("id", id);
		boolean judeg = delete(wrapper);
		return judeg;
	}

	@Override
	public boolean UserDelList(List<String> list) {
		boolean judeg = deleteBatchIds(list);
		return judeg;
	}

	@Override
	public boolean UpdateUserById(User user, Integer id) {
		EntityWrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.eq("id", id);
		boolean judeg = update(user, wrapper);
		return judeg;
	}

	@Override
	public User selectExit(Integer id) {
		EntityWrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.eq("id", id);
		User user = selectById(id);
		return user;
	}

}

package com.erpSys.main.servive.Impl;

import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.UserroleMapper;
import com.erpSys.main.model.Userrole;
import com.erpSys.main.service.UserRoleService;

public class UserRoleServiceImpl extends ServiceImpl<UserroleMapper, Userrole> implements UserRoleService {

	@Override
	public List<Userrole> SelectByPower(Userrole role) {
		EntityWrapper<Userrole> wrapper = new EntityWrapper<Userrole>();
		wrapper.eq("user_id", 0);
		List<Userrole> list = selectList(wrapper);
		return list;
	}

}

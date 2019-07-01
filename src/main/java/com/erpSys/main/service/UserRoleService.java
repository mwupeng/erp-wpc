package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Userrole;

public interface UserRoleService extends IService<Userrole> {

	public List<Userrole> SelectByPower(Userrole role);
}

package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService extends IService<User> {

	/**
	 * * user分页
	 * 
	 * @param user
	 * @return
	 */
	public PageInfo<User> selectByPage(int pageNo, int pageSize);

	/**
	 * 用户管理添加
	 * 
	 * @param powerresource
	 * @return
	 */
	public boolean UserInsert(User user);

	/**
	 * 用户管理根据id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean UserDel(Integer id);

	/**
	 * 用户管理根据多个id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean UserDelList(List<String> list);

	/**
	 * 根据id修改
	 * 
	 * @param user
	 * @param id
	 * @return
	 */
	public boolean UpdateUserById(User user, Integer id);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public User selectExit(Integer id);

}

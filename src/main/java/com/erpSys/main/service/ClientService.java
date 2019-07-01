package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Client;
import com.github.pagehelper.PageInfo;

public interface ClientService extends IService<Client> {

	/**
	 * 根据id删除
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Client> selectByPage(int pageNo, int pageSize);

	/**
	 * 根据id进行删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean delById(Integer id);

	/**
	 * 用户管理根据多个id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean ClientDelList(List<String> list);

	/**
	 * 客户添加
	 * 
	 * @param powerresource
	 * @return
	 */
	public boolean ClientInsert(Client client);

	/**
	 * 根据id修改
	 * 
	 * @param user
	 * @param id
	 * @return
	 */
	public boolean UpdateClientById(Client client, Integer id);

	/**
	 * 一对一查询 根据名称查询地址
	 * 
	 * @param name
	 * @return
	 */
	public List<Client> selectAddress(String name);

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Client selectExit(Integer id);

	/**
	 * 查询用户姓名
	 * 
	 * @return
	 */
	public List<Client> selectName();
	
	/**
	 * 所有客户
	 * @return
	 */
	public List<Client> selectList();

}

package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Client;
import com.erpSys.main.model.Clientaddress;

public interface ClientAddressService extends IService<Clientaddress> {

	/**
	 * 查询数据
	 * 
	 * @return
	 */
	public List<Client> selectaddress(String name);

	/**
	 * 查询对应用户
	 * 
	 * @return
	 */
	public List<Clientaddress> selectClient();

	/**
	 * 添加客户
	 * 
	 * @return
	 */
	public boolean ClientAddressIn(Clientaddress clientaddress, String name);

	/**
	 * 删除数据
	 * 
	 * @param Delect
	 * @param name
	 * @return
	 */
	public boolean Delect(Integer id);

	/**
	 * 删除多个数据
	 * 
	 * @param list
	 * @return
	 */
	public boolean DelList(List<String> list);

	/**
	 * 根据id查询数据
	 * 
	 * @return
	 */
	public List<Clientaddress> selectAddress(Integer id);

	/**
	 * 更新数据
	 * 
	 * @param clientaddress
	 * @return
	 */
	public boolean updateEntity(Clientaddress clientaddress, Integer id);

	/**
	 * 	根据客户ID查询对应的客户地址
	 * @param id
	 * @return
	 */
	public List<Clientaddress> selectClentById(Integer id);
}

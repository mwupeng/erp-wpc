package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Powerresource;
import com.github.pagehelper.PageInfo;

public interface PowerService extends IService<Powerresource> {

	/**
	 * 
	 * @param pageNo   当前页
	 * @param pageSize 每页数据数
	 * @return
	 */
	public PageInfo<Powerresource> selectByPage(int pageNo, int pageSize);

	/**
	 * 资源管理添加
	 * 
	 * @param powerresource
	 * @return
	 */
	public boolean UrlInsert(Powerresource powerresource);

	/**
	 * 根据id进行删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean delById(Integer id);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public List<Powerresource> selectByExit(Integer id);

	/**
	 * 根据id修改
	 * 
	 * @param powerresource
	 * @param id
	 * @return
	 */
	public boolean UpdatePowerById(Powerresource powerresource, Integer id);
	
	

}

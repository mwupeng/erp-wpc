package com.erpSys.main.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.erpSys.main.model.Powerresource;
import com.erpSys.main.model.Section;
import com.github.pagehelper.PageInfo;

public interface SectionService extends IService<Section> {
	/**
	 * 
	 * @param pageNo   当前页
	 * @param pageSize 每页数据数
	 * @return
	 */
	public PageInfo<Section> selectByPage(int pageNo, int pageSize);

	/**
	 * 根据id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean SectionDel(Integer id);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public List<Section> selectByExit(Integer id);

	/**
	 * 
	 * @param section
	 * @param id
	 * @return
	 */
	public boolean UpdateSectionById(Section section, Integer id);

	/**
	 * 用户管理根据多个id删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean SectionDelList(List<String> list);
}

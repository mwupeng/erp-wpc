package com.erpSys.main.servive.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.PowerresourceMapper;
import com.erpSys.main.model.Powerresource;
import com.erpSys.main.service.PowerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PowerServiceImpl extends ServiceImpl<PowerresourceMapper, Powerresource> implements PowerService {

	@Override
	public PageInfo<Powerresource> selectByPage(int pageNo, int pageSize) {
		EntityWrapper<Powerresource> wrapper = new EntityWrapper<Powerresource>();
		PageHelper.startPage(pageNo, pageSize);
		List<Powerresource> list = selectList(wrapper);
		PageInfo<Powerresource> page = new PageInfo<Powerresource>(list);
		return page;
	}

	@Override
	public boolean UrlInsert(Powerresource powerresource) {
		boolean judeg = insertAllColumn(powerresource);
		return judeg;
	}

	@Override
	public boolean delById(Integer id) {
		boolean judeg = deleteById(id);
		return judeg;
	}

	@Override
	public List<Powerresource> selectByExit(Integer id) {
		EntityWrapper<Powerresource> wrapper = new EntityWrapper<Powerresource>();
		wrapper.eq("id", id);
		List<Powerresource> list = selectList(wrapper);
		return list;
	}

	@Override
	public boolean UpdatePowerById(Powerresource powerresource, Integer id) {
		EntityWrapper<Powerresource> wrapper = new EntityWrapper<Powerresource>();
		wrapper.eq("id", id);
		boolean judeg = update(powerresource, wrapper);
		return judeg;
	}

}

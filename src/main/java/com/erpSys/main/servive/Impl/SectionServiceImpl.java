package com.erpSys.main.servive.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.SectionMapper;
import com.erpSys.main.model.Powerresource;
import com.erpSys.main.model.Section;
import com.erpSys.main.service.SectionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SectionServiceImpl extends ServiceImpl<SectionMapper, Section> implements SectionService {

	@Override
	public PageInfo<Section> selectByPage(int pageNo, int pageSize) {
		EntityWrapper<Section> wrapper = new EntityWrapper<Section>();
		PageHelper.startPage(pageNo, pageSize);
		List<Section> list = selectList(wrapper);
		PageInfo<Section> page = new PageInfo<Section>(list);
		return page;
	}

	@Override
	public boolean SectionDel(Integer id) {
		boolean judge = deleteById(id);
		return judge;
	}

	@Override
	public List<Section> selectByExit(Integer id) {
		EntityWrapper<Section> wrapper = new EntityWrapper<Section>();
		wrapper.eq("id", id);
		List<Section> list = selectList(wrapper);
		return list;
	}

	@Override
	public boolean UpdateSectionById(Section section, Integer id) {
		EntityWrapper<Section> wrapper = new EntityWrapper<Section>();
		wrapper.eq("id", id);
		boolean judeg = update(section, wrapper);
		return judeg;
	}

	@Override
	public boolean SectionDelList(List<String> list) {
		boolean judeg = deleteBatchIds(list);
		return judeg;
	}

}

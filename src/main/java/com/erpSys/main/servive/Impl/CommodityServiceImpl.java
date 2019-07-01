package com.erpSys.main.servive.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.CommodityMapper;
import com.erpSys.main.model.Commodity;
import com.erpSys.main.service.CommodityService;

@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {

	@Override
	public List<Commodity> SelectdbList() {
		EntityWrapper<Commodity> wrapper = new EntityWrapper<Commodity>();
		return selectList(wrapper);
	}

	@Override
	public Commodity SelectdbComm(Integer id) {
		Commodity commodity = selectById(id);
		return commodity;
	}

}

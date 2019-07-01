package com.erpSys.main.servive.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.ProductlistMapper;
import com.erpSys.main.mapper.SalesorderMapper;
import com.erpSys.main.model.Commodity;
import com.erpSys.main.model.Productlist;
import com.erpSys.main.model.Salesorder;
import com.erpSys.main.service.CommodityService;
import com.erpSys.main.service.ProductlistService;
import com.erpSys.main.service.SalesorderService;

@Service
public class SalesorderServiceImpl extends ServiceImpl<SalesorderMapper, Salesorder> implements SalesorderService {

	@Autowired
	private SalesorderMapper salesorderMapper;

	@Autowired
	private ProductlistMapper productlistMapper;

	@Autowired
	private CommodityService commodityService;

	@Autowired
	private ProductlistService productlistService;

	@Override
	public List<Salesorder> selectList() {
		List<Salesorder> list = salesorderMapper.SelectCUList();
		for (Salesorder salesorder : list) {
			int Commodityid = Integer.parseInt(salesorder.getCommodityid());
			double price = PriceCommtity(Commodityid);
			salesorder.setPrices(price);
		}
		return list;
	}

	@Override
	public List<Salesorder> selectByClientId(Integer clientId) {

		List<Salesorder> list = salesorderMapper.SelectByIdcommlist(clientId);

		for (Salesorder salesorder : list) {
			int Commodityid = Integer.parseInt(salesorder.getCommodityid());
			double price = PriceCommtity(Commodityid);
			salesorder.setPrices(price);
		}
		return list;
	}

	@Override
	public double PriceCommtity(Integer salesorderid) {
		List<Productlist> list = productlistMapper.Selectcommditylist(salesorderid);
		double math = 0.0;
		for (Productlist productlist : list) {
			math = math + (productlist.getCommoditymath() * productlist.getCommodity().getCommodityprice());
		}
		return math;
	}

	@Override
	public Map<Integer, Productlist> proMap(Integer[] id, Integer[] count, Map<Integer, Productlist> map) {
		Map<Integer, Productlist> mapcom = new HashMap<Integer, Productlist>();
		for (int i = 0; i < id.length; i++) {

			Productlist productlist = new Productlist();
			productlist.setCommodityid(id[i]);
			productlist.setCommoditymath(count[i]);
			mapcom.put(id[i], productlist);

		}
		return mapcom;
	}

	@Override
	public List<Productlist> mapList(Map<Integer, Productlist> map) {
		List<Productlist> list = null;
		try {
			list = new ArrayList<Productlist>();
			for (Productlist productlist : map.values()) {
				Commodity commodity = commodityService.SelectdbComm(productlist.getCommodityid());
				productlist.setCommodity(commodity);
				list.add(productlist);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return list;
	}

	@Override
	public int InserDb(Salesorder salesorder, Map<Integer, Productlist> map) {
		if (map == null) {
			return 0;
		} else {
			salesorderMapper.InserDb(salesorder);
			int i = salesorder.getSalesorderid();
			salesorder.setCommodityid(String.valueOf(i));
			EntityWrapper<Salesorder> wrapper = new EntityWrapper<Salesorder>();
			wrapper.eq("salesorderid", i);
			update(salesorder, wrapper);
			List<Productlist> list = mapList(map);
			for (Productlist productlist : list) {
				productlist.setSalesorderid(i);
				double price = productlist.getCommodity().getCommodityprice() * productlist.getCommoditymath();
				productlist.setPrice(price);
				productlistMapper.insert(productlist);
			}

			return 1;
		}

	}

}

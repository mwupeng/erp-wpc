package com.erpSys.main.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.erpSys.main.model.Client;
import com.erpSys.main.model.Clientaddress;
import com.erpSys.main.model.Commodity;
import com.erpSys.main.model.Productlist;
import com.erpSys.main.model.Salesorder;
import com.erpSys.main.service.ClientAddressService;
import com.erpSys.main.service.ClientService;
import com.erpSys.main.service.CommodityService;
import com.erpSys.main.service.SalesorderService;

@Controller
@RequestMapping("/salesorder")
public class SalesorderController {

	@Autowired
	private ClientService clientservice;

	@Autowired
	private ClientAddressService clientAddressService;

	@Autowired
	private SalesorderService salesorderService;

	@Autowired
	private CommodityService commodityService;

	private Map<Integer, Productlist> map = null;

	/**
	 * 客户地址
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView index(@RequestParam(value = "id", defaultValue = "") String id) {
		ModelAndView andView = new ModelAndView();
		List<Client> Namelist = clientservice.selectList();
		andView.addObject("Clientlist", Namelist);
		if (id == "" || id.equals("")) {
			List<Salesorder> list = salesorderService.selectList();
			andView.addObject("list", list);
		} else if (id != "" || !id.equals("")) {
			Integer Id = Integer.parseInt(id);
			List<Salesorder> list = salesorderService.selectByClientId(Id);
			andView.addObject("list", list);
		}
		andView.setViewName("/salesorder/salesorder-index");
		return andView;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/InIndex")
	public String DBInsert(@RequestParam(value = "id") Integer id, HttpSession session) {
		List<Clientaddress> list = clientAddressService.selectClentById(id);
		session.setAttribute("option", list);
		return "/salesorder/salesorder-insert";

	}

	/**
	 * 选中商品
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/CommdityIndex")
	public String CommdityIndex(HttpSession session) {
		List<Commodity> list = commodityService.SelectdbList();
		session.setAttribute("commodity", list);
		return "/salesorder/salesorder-commdity";

	}

	/**
	 * 临时数据
	 * 
	 * @param id
	 * @param count
	 * @return
	 */
	@RequestMapping("/CommdityList")
	@ResponseBody
	public Object CommdityList(@RequestParam(value = "CommotidyId", defaultValue = "") Integer[] id,
			@RequestParam(value = "Count", defaultValue = "") Integer[] count) {
		map = salesorderService.proMap(id, count, map);
		return true;
	}

	@RequestMapping("/selectComm")
	public Object selectComm(HttpSession session) {
		if (map == null) {
			return "/salesorder/salesorder-commdityExit";
		} else {
			List<Productlist> maplist = salesorderService.mapList(map);
			session.setAttribute("list", maplist);
			return "/salesorder/salesorder-commdityExit";
		}
	}

	@RequestMapping("/InsertDb")
	@ResponseBody
	public Object InsertDb(@RequestParam("clientId") Integer id, @RequestParam("Creation") String creation,
			@RequestParam("CreatioName") String CreatioName, @RequestParam("userId") Integer userId,
			@RequestParam("address") Integer address, @RequestParam("advance") Double advance,
			@RequestParam("remark") String remark, @RequestParam("clientId") Integer clientId) {

		Salesorder salesorder = new Salesorder();
		salesorder.setCreation(creation);
		salesorder.setCreationname(CreatioName);
		salesorder.setUserid(userId);
		salesorder.setClientid(clientId);
		salesorder.setAdvance(advance);
		salesorder.setStates(1);
		salesorder.setShippingaddress(address);
		int i = salesorderService.InserDb(salesorder, map);
		map = null;
		return i;

	}

}

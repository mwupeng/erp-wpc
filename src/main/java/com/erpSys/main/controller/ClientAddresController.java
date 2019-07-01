package com.erpSys.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.erpSys.main.model.Client;
import com.erpSys.main.model.Clientaddress;
import com.erpSys.main.service.ClientAddressService;
import com.erpSys.main.service.ClientService;

@Controller
@RequestMapping("/clientaddress")
public class ClientAddresController {

	@Autowired
	private ClientAddressService clientaddressService;

	@Autowired
	private ClientService clientservice;

	/**
	 * 客户地址
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView index(@RequestParam(value = "name", defaultValue = "") String name) {
		ModelAndView andView = new ModelAndView();
		List<Client> Namelist = clientservice.selectName();
		andView.addObject("Clientlist", Namelist);
		if (name == "" || name.equals("")) {
			List<Clientaddress> Addresslist = clientaddressService.selectClient();
			andView.addObject("address", Addresslist);
		} else {
			List<Client> client = clientaddressService.selectaddress(name);
			andView.addObject("Client", client);
		}

		andView.setViewName("/clientaddress/clientaddress-index");
		return andView;

	}

	/**
	 * 客户地址添加
	 * 
	 * @param name
	 * @param Creation
	 * @param creatioName
	 * @param consignee
	 * @param Phone
	 * @param Address
	 * @param remark
	 * @return
	 */
	@RequestMapping("/AddressIn")
	@ResponseBody
	public Object AddressIn(@RequestParam(value = "name", defaultValue = "sa") String name,
			@RequestParam("Creation") String Creation, @RequestParam("CreatioName") String creatioName,
			@RequestParam("Consignee") String consignee, @RequestParam("Phone") String Phone,
			@RequestParam("Address") String Address, @RequestParam("Remark") String remark) {
		Clientaddress clientaddress = new Clientaddress();
		clientaddress.setCreation(Creation);
		clientaddress.setCreationame(creatioName);
		clientaddress.setConsignee(consignee);
		clientaddress.setConsigneephone(Phone);
		clientaddress.setAddress(Address);
		clientaddress.setRemark(remark);
		clientaddress.setState(0);
		clientaddress.setStatus("A");
		boolean judeg = clientaddressService.ClientAddressIn(clientaddress, name);
		if (judeg) {
			return 0;
		} else {
			return 1;
		}

	}

	/**
	 * 客户地址添加页面
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping("/AddressInindex")
	public Object AddressIn(@RequestParam(value = "name", defaultValue = "sa") String name) {
		return "/clientaddress/clientaddress-insert";
	}

	/**
	 * 客户地址删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public Object Delete(@RequestParam("id") Integer id) {
		boolean judeg = clientaddressService.Delect(id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 多选客户地址删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/DelList")
	@ResponseBody
	public Object DelList(@RequestParam("id") String[] id) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < id.length; i++) {
			list.add(id[i]);
		}
		boolean judeg = clientaddressService.DelList(list);

		if (judeg) {
			return list.size();
		} else {
			return 0;
		}
	}

	/**
	 * 跳转编辑
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping("/ExitIndex")
	public Object Exit(@RequestParam("id") Integer id, HttpSession session) {
		List<Clientaddress> list = clientaddressService.selectAddress(id);
		session.setAttribute("address", list);
		return "/clientaddress/clientaddress-exit";

	}

	@RequestMapping("/AddressUp")
	@ResponseBody
	public Object Addressup(@RequestParam(value = "id") Integer id, @RequestParam("Creation") String Creation,
			@RequestParam("CreatioName") String creatioName, @RequestParam("Consignee") String consignee,
			@RequestParam("Phone") String Phone, @RequestParam("Address") String Address,
			@RequestParam("Remark") String remark) {
		Clientaddress clientaddress = new Clientaddress();
		clientaddress.setCreation(Creation);
		clientaddress.setCreationame(creatioName);
		clientaddress.setConsignee(consignee);
		clientaddress.setConsigneephone(Phone);
		clientaddress.setAddress(Address);
		clientaddress.setRemark(remark);
		clientaddress.setState(0);
		clientaddress.setStatus("A");
		boolean judeg = clientaddressService.updateEntity(clientaddress, id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}

	}

}

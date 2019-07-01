package com.erpSys.main.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.erpSys.main.model.Client;
import com.erpSys.main.model.User;
import com.erpSys.main.service.ClientService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	/**
	 * 客户>编辑
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Exit")
	public ModelAndView ClientExit(@RequestParam("id") Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		Client user = clientService.selectExit(id);
		mv.addObject("user", user);
		mv.setViewName("/client/clietn-exit");
		return mv;
	}

	/**
	 * 客户添加 》 添加
	 * 
	 * @return
	 */
	@RequestMapping(value = "/ClientInsert")
	public String ClientInsert() {
		return "/client/clietn-insert";
	}

	/**
	 * 资源管理
	 * 
	 * @param session
	 * @return
	 */

	@RequestMapping("/index")
	public Object ResourcePage(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", required = false, defaultValue = "1") int pageSize, Model model,
			HttpSession session) {
		PageInfo<Client> page = clientService.selectByPage(pageNo, 10);
		System.err.println("当前页 ： " + pageNo);
		List<Client> list = page.getList();
		session.setAttribute("clientlist", list);
		model.addAttribute("page", page);
		return "/client/client-index";

	}

	/**
	 * 资源部门>数据删除
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/clientDel")
	@ResponseBody
	public Object ClientDel(@RequestParam("id") Integer id) throws IOException {
		boolean judeg = clientService.delById(id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
	}

	@RequestMapping("/ClientDelList")
	@ResponseBody
	public Object ClientDelList(@RequestParam("id") String[] id) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < id.length; i++) {
			list.add(id[i]);
		}
		try {
			boolean judeg = clientService.ClientDelList(list);

			if (judeg) {
				return list.size();
			} else {
				return 0;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "e";
		}
	}

	/**
	 * 客户>添加>数据添加
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 */
	@RequestMapping(value = "/ClientIn")
	@ResponseBody
	public Object ClientIn(@RequestParam("Creation") String Creation, @RequestParam("CreationName") String CreationName,
			@RequestParam("ClientName") String ClientName, @RequestParam("ClientSource") Integer ClientSource,
			@RequestParam("ClientCompany") String ClientCompany, @RequestParam("sex") int sex,
			@RequestParam("ClientGrade") int ClientGrade, @RequestParam("Age") int Age,
			@RequestParam("Phone") String Phone, @RequestParam("OtherContacts") String OtherContacts) {
		Client client = new Client();
		client.setCreation(Creation);
		client.setCreationname(CreationName);
		client.setContact(ClientName);
		client.setCompany(ClientCompany);
		client.setSource(ClientSource);
		client.setContactsex(sex);
		client.setContactage(Age);
		client.setContactphone(Phone);
		client.setClientgrade(ClientGrade);
		client.setStatus("A");
		client.setCreationtime(new Date());

		try {
			boolean judeg = clientService.ClientInsert(client);
			if (judeg) {
				return 1;
			} else {
				return 0;
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			return 2;
		}

	}

	/**
	 * 客户>添加>数据添加
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 */
	@RequestMapping(value = "/Clientup")
	@ResponseBody
	public Object ClientUp(@RequestParam("Creation") String Creation, @RequestParam("CreationName") String CreationName,
			@RequestParam("ClientName") String ClientName, @RequestParam("ClientSource") Integer ClientSource,
			@RequestParam("ClientCompany") String ClientCompany, @RequestParam("sex") int sex,
			@RequestParam("ClientGrade") int ClientGrade, @RequestParam("Age") int Age,
			@RequestParam("Phone") String Phone, @RequestParam("OtherContacts") String OtherContacts,
			@RequestParam("id") int id) {
		Client client = new Client();
		client.setCreation(Creation);
		client.setCreationname(CreationName);
		client.setContact(ClientName);
		client.setCompany(ClientCompany);
		client.setSource(ClientSource);
		client.setContactsex(sex);
		client.setContactage(Age);
		client.setContactphone(Phone);
		client.setClientgrade(ClientGrade);
		client.setStatus("A");
		client.setCreationtime(new Date());

		try {
			boolean judeg = clientService.UpdateClientById(client, id);
			if (judeg) {
				return 1;
			} else {
				return 0;
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			return 2;
		}

	}
}

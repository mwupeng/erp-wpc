package com.erpSys.main.controller;

import java.util.ArrayList;
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

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.erpSys.main.model.Powerresource;
import com.erpSys.main.model.User;
import com.erpSys.main.model.Userpower;
import com.erpSys.main.service.UserService;
import com.github.pagehelper.PageInfo;

import junit.framework.Test;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;

	/**
	 * 资源部门>编辑
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Exit")
	public ModelAndView ResourceExit(@RequestParam("id") Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = userservice.selectExit(id);
		mv.addObject("user", user);
		mv.setViewName("/user/user-exit");
		return mv;
	}

	/**
	 * 更新用户数据
	 * @param id
	 * @param LoginName
	 * @param name
	 * @param PassWord
	 * @param roleId
	 * @param sex
	 * @param Age
	 * @param Phone
	 * @param organizationId
	 * @return
	 */
	@RequestMapping("/UserUpdate")
	@ResponseBody
	public Object ResourceExit(@RequestParam("id") Integer id, @RequestParam("LoginName") String LoginName,
			@RequestParam("UserName") String name, @RequestParam("PassWord") String PassWord,
			@RequestParam("Duty") Integer roleId, @RequestParam("sex") Integer sex, @RequestParam("Age") Integer Age,
			@RequestParam("Phone") String Phone, @RequestParam("department") String organizationId) {
		User user = new User();
		user.setLoginname(LoginName);
		user.setName(name);
		user.setPassword(PassWord);
		user.setRoleid(roleId);
		user.setSex(sex);
		user.setAge(Age);
		user.setPhone(Phone);
		user.setOrganizationid(organizationId);

		boolean judeg = false;
		try {
			judeg = userservice.UpdateUserById(user, id);
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
	 * 资源管理
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/user")
	public String Userpage(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", required = false, defaultValue = "1") int pageSize, Model model,
			HttpSession session) {
		PageInfo<User> page = userservice.selectByPage(pageNo, 10);
		System.err.println("当前页 ： " + pageNo);
		List<User> userslist = page.getList();
		session.setAttribute("userlist", userslist);
		model.addAttribute("page", page);
		return "/user/user-user";

	}

	/**
	 * 权限管理>用户管理>添加网页
	 * 
	 * @return
	 */
	@RequestMapping("/UserInsertUrl")
	public String UserInsertUrl() {
		return "/user/user-insert";
	}

	/**
	 * 权限管理>用户管理>添加数据
	 * 
	 * @param LoginName
	 * @param name
	 * @param PassWord
	 * @param roleId
	 * @param sex
	 * @param Age
	 * @param Phone
	 * @param organizationId
	 * @return
	 */
	@RequestMapping("/userInsert")
	@ResponseBody
	public Object UserInsert(@RequestParam("LoginName") String LoginName, @RequestParam("UserName") String name,
			@RequestParam("PassWord") String PassWord, @RequestParam("Duty") Integer roleId,
			@RequestParam("sex") Integer sex, @RequestParam("Age") Integer Age, @RequestParam("Phone") String Phone,
			@RequestParam("department") String organizationId) {
		User user = new User();
		user.setLoginname(LoginName);
		user.setName(name);
		user.setPassword(PassWord);
		user.setRoleid(roleId);
		user.setSex(sex);
		user.setAge(Age);
		user.setPhone(Phone);
		user.setOrganizationid(organizationId);
		boolean judeg = false;
		try {
			judeg = userservice.UserInsert(user);
			if (judeg) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "2";
		}

	}

	@RequestMapping("/userDel")
	@ResponseBody
	public Object UserDel(@RequestParam("id") Integer id) {
		boolean judeg = userservice.UserDel(id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
	}

	@RequestMapping("/userDelList")
	@ResponseBody
	public Object UserDelList(@RequestParam("id") String[] id) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < id.length; i++) {
			list.add(id[i]);
		}
		boolean judeg = userservice.UserDelList(list);

		if (judeg) {
			return list.size();
		} else {
			return 0;
		}
	}
}

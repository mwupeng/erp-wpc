package com.erpSys.main.controller;

import java.io.IOException;
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

import com.erpSys.main.model.Powerresource;
import com.erpSys.main.service.PowerService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/power")
public class PowerController {

	@Autowired
	private PowerService powerservice;

	/**
	 * 角色管理
	 * 
	 * @return
	 */

	@RequestMapping(value = "/user")
	public String user() {
		return "/power/power-user";
	}

	/**
	 * 部门管理
	 * 
	 * @return
	 */
	@RequestMapping(value = "/section")
	public String section() {
		return "/power/power-section";
	}

	/**
	 * 资源部门>添加
	 * 
	 * @return
	 */
	@RequestMapping(value = "/ResourceInsert")
	public String ResourceInsert() {
		return "/power/power-insert";
	}

	/**
	 * 资源部门>编辑
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Exit")
	public ModelAndView ResourceExit(@RequestParam("id") Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		List<Powerresource> list = powerservice.selectByExit(id);
		mv.addObject("list", list);
		mv.setViewName("/power/power-exit");
		return mv;
	}

	/**
	 * 资源部门>添加>数据添加
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 */
	@RequestMapping(value = "/UrlInsert")
	@ResponseBody
	public Object UrlInsert(@RequestParam("url") String url, @RequestParam("PathName") String PathName,
			@RequestParam("developer") String developer) {
		Powerresource powerresource = new Powerresource();
		powerresource.setUrl(url);
		powerresource.setType("ajax");
		powerresource.setPathname(PathName);
		powerresource.setDeveloper(developer);
		powerresource.setCreationtime(new Date());
		boolean judeg = powerservice.UrlInsert(powerresource);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}

	}

	/**
	 * 资源部门>添加>数据更新
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 */
	@RequestMapping(value = "/UrlUpdate")
	@ResponseBody
	public Object UrlUpdate(@RequestParam("url") String url, @RequestParam("PathName") String PathName,
			@RequestParam("developer") String developer, Integer id) {
		Powerresource powerresource = new Powerresource();
		powerresource.setUrl(url);
		powerresource.setPathname(PathName);
		powerresource.setDeveloper(developer);
		powerresource.setModificationtime(new Date());
		boolean judeg = powerservice.UpdatePowerById(powerresource, id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
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
	@RequestMapping(value = "/Urldel")
	@ResponseBody
	public Object UrlInsert(@RequestParam("id") Integer id) throws IOException {
		boolean judeg = powerservice.delById(id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 资源管理
	 * 
	 * @param session
	 * @return
	 */

	@RequestMapping("/resource")
	public Object ResourcePage(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", required = false, defaultValue = "1") int pageSize, Model model,
			HttpSession session) {
		PageInfo<Powerresource> page = powerservice.selectByPage(pageNo, 10);
		System.err.println("当前页 ： " + pageNo);
		List<Powerresource> list = page.getList();
		session.setAttribute("list", list);
		model.addAttribute("page", page);
		return "/power/power-resource";

	}

	/**
	 * 
	 * @param pageNo   当前页
	 * @param pageSize
	 * @param model
	 * @return
	 */
	@RequestMapping("/test")
	@ResponseBody
	public Object Powerurl() {

		PageInfo<Powerresource> page = powerservice.selectByPage(1, 9);

		return page;
	}
}

package com.erpSys.main.controller;

import java.io.IOException;
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

import com.erpSys.main.model.Section;
import com.erpSys.main.service.SectionService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/section")
public class SectionController {

	@Autowired
	private SectionService sectionService;

	@RequestMapping(value = "/index")
	public Object section(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", required = false, defaultValue = "1") int pageSize, Model model,
			HttpSession session) {

		PageInfo<Section> page = sectionService.selectByPage(pageNo, 10);
		System.err.println("当前页 ： " + pageNo);
		List<Section> userslist = page.getList();
		session.setAttribute("sectionlist", userslist);
		model.addAttribute("page", page);
		return "/section/section-index";

	}

	/**
	 * 部门管理>数据删除
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/Sectiondel")
	@ResponseBody
	public Object UrlInsert(@RequestParam("id") Integer id) throws IOException {
		boolean judeg = sectionService.SectionDel(id);
		if (judeg) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 资源部门>编辑
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Exit")
	public ModelAndView SectionExit(@RequestParam("id") Integer id, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		List<Section> list = sectionService.selectByExit(id);
		mv.addObject("list", list);
		mv.setViewName("/section/section-exit");
		return mv;
	}

	/**
	 * 资源部门>添加>数据更新
	 * 
	 * @param url
	 * @param PathName
	 * @param developer
	 * @return
	 */
	@RequestMapping(value = "/SectionUpdate")
	@ResponseBody
	public Object UrlUpdate(@RequestParam("id") Integer id, @RequestParam("SectionName") String SectionName) {
		Section section = new Section();
		section.setDepartment(SectionName);
		boolean judeg = false;
		try {
			judeg = sectionService.UpdateSectionById(section, id);
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

	@RequestMapping("/sectionDelList")
	@ResponseBody
	public Object UserDelList(@RequestParam("id") String[] id) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < id.length; i++) {
			list.add(id[i]);
		}
		boolean judeg = sectionService.SectionDelList(list);
		if (judeg) {
			return list.size();
		} else {
			return 0;
		}
	}
}

package com.erpSys.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	/**
	 * 登录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	/**
	 * 主页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

}

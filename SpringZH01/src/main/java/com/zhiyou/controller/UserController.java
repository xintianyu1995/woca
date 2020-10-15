package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.User;
import com.zhiyou.userservice.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping("show")
	public String show(HttpServletRequest req,HttpServletResponse rep){
		req.setAttribute("list", service.select());
		return "show";
	}
	@RequestMapping("add")
	public String add(User user,HttpServletRequest req, HttpServletResponse rep){
		service.add(user);
		return "foreard:show";
	}
}

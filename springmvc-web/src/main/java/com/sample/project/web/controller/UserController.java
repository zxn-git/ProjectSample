package com.sample.project.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.project.mybatis_core.model.User;
import com.sample.project.spring_service.service.IUserService;

@Controller
@RequestMapping("/userController")
public class UserController {

	@Autowired
	private IUserService iUserService;

	@RequestMapping(value = "/listUser")
	public String listUser(HttpServletRequest request) {
		List<User> all = iUserService.getAll();
		request.setAttribute("userlist", all);
		return "listUser";
	}
}

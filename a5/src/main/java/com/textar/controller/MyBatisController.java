package com.textar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.textar.pojo.User;
import com.textar.service.MyBatisUserService;

@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
	@Autowired
	private MyBatisUserService myBatisUserService=null;
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		return myBatisUserService.getUser(id);
	}
	@RequestMapping("/getUser2")
	@ResponseBody
	public String getUser2(int id) {
		return "aasdfasdfasdf";
	}
}

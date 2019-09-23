package com.holt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.holt.bean.EasyUIResult;
import com.holt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 查询用户列表
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping(value = "list" ,method = RequestMethod.GET)
	@ResponseBody
	//从页面获取当前页，和当前页的行数
	public EasyUIResult queryUserList(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows) {
		//传入当前页 page 和当前的行数 从service分页后获取easyUIResult 
		EasyUIResult easyUIResult = userService.queryUserList(page,rows);
		System.out.println(easyUIResult.getRows());
		return easyUIResult;
	}
}

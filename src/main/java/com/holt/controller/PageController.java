package com.holt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/page")
public class PageController {

	
	/**
	 * 具體的跳轉邏輯
	 * @param pageName
	 * @return
	 */
	@RequestMapping( value="{pageName}",method = RequestMethod.GET)
	public String toPage(HttpServletRequest request , @PathVariable("pageName") String pageName) {
		System.out.println("进入。..pagename名字："+pageName);
		
		System.out.println("Scheme:"+request.getScheme());
		System.out.println("ServerName:"+request.getServerName());
		System.out.println("serverPort:"+request.getServerPort());
		System.out.println("contextPath:"+request.getContextPath());
		System.out.println("contextPath:"+request.getContextPath());
		System.out.println("contextPath:"+request.getContextPath());
		System.out.println("contextPath:"+request.getContextPath());
		System.out.println("serverPath:"+request.getServletPath());
		System.out.println("serverPath:"+request.getServletPath());
		System.out.println("serverPath:"+request.getServletPath());
		//胜多负少
		return pageName;
		//又添加了数据
		//添加了测试数据
		//添加了测试数据
		//sdf
		//再次添加数据
		//还添加了这个
		//然后我又添加了
		//再次调剂
	}
}

package com.holt.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.holt.pojo.User;
import com.holt.service.UserService;

@RequestMapping("new/user")
@Controller
public class NewUserContrller {

	@Autowired
	private UserService service;

	/**
	 * 根据用户id查询用户信息
	 * 
	 * @param id
	 * @return
	 */

	@ResponseBody
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<User> QueryUserById(@PathVariable("id") Long id) {

		try {
			User user = service.QueryUserById(id);
			if (user == null) {
				// 资源不存在相应404

				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			// 资源存在
			// ResponseEntity.ok(user);
			return ResponseEntity.status(HttpStatus.OK).body(user);
		} catch (Exception e) {

			// 服务器错误时500
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}
	}

	/**
	 * 新增user资源
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> saveUser(User user) {
		try {
			Boolean bool = service.saveUser(user);
			if (bool) {
				// 创建成功，相应201
				return ResponseEntity.status(HttpStatus.CREATED).body(null);
			}
		} catch (Exception e) {
			// 响应失败或者其他错误
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}
	
	/**
	 * 修改用户
	 * @return 返回码
	 */
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> updateUser(User user){
		try {
			Boolean bool = service.updateUser(user);
			if (bool) {
				// 修改成功，响应204
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
			}
		} catch (Exception e) {
			// 修改失败或者其他错误
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
	
	/**
	 * 删除用户
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUser(@RequestParam (value = "id",defaultValue = "0") Long id){
		try {
			//id=0
			if(id == 0) {
				//缺少参数id400
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			Boolean bool = service.deleteUser(id);
			if (bool) {
				// 删除成功，响应204
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
			}
		} catch (Exception e) {
			// 修改失败或者其他错误
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		
	}
 }

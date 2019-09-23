package com.holt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.holt.bean.EasyUIResult;
import com.holt.dao.UserMapper;
import com.holt.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public EasyUIResult queryUserList(Integer page, Integer rows) {
		// 设置分页参数
		PageHelper.startPage(page, rows);

		// 设置排序条件
		Example example = new Example(User.class);
		example.setOrderByClause("updated Desc");
		// 查询user数据
		List<User> users = userMapper.selectByExample(example);
		// 获取分页后的信息
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		return new EasyUIResult(pageInfo.getTotal(), pageInfo.getList());
	}

	/**
	 * 根据用户id查询用户
	 * 
	 * @param id
	 * @return user
	 */
	public User QueryUserById(Long id) {

		return userMapper.selectByPrimaryKey(id);
	}

	public Boolean saveUser(User user) {
		int insert = userMapper.insert(user);

		return insert == 1;
	}

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	public Boolean updateUser(User user) {
		int row = userMapper.updateByPrimaryKeySelective(user);

		return row == 1;
	}

	public Boolean deleteUser(Long id) {
		
		
		return userMapper.deleteByPrimaryKey(id) ==1 ;
	}

}

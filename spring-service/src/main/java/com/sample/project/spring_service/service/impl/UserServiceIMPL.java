package com.sample.project.spring_service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sample.project.mybatis_core.dao.IUserMapper;
import com.sample.project.mybatis_core.model.User;
import com.sample.project.spring_service.service.IUserService;

public class UserServiceIMPL implements IUserService {

	@Resource(name = "iUserMapper")
	private IUserMapper iUserMapper;

	@Override
	public List<User> getAll() {
		return iUserMapper.selectUserAll();
	}

	@Override
	public User selectByPrimaryKey(int id) {
		return iUserMapper.selectUserByID(id);
	}

	@Override
	public int insert(User user) {
		return iUserMapper.addUser(user);
	}

	@Override
	public int update(User user) {
		return iUserMapper.updateUser(user);
	}

	@Override
	public int delete(int id) {
		return iUserMapper.deleteUser(id);
	}

}

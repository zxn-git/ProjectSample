package com.sample.project.mybatis_core;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sample.project.mybatis_core.dao.IUserMapper;
import com.sample.project.mybatis_core.model.User;

public class UserTest extends Father{

	/**
	 * 测试查询一条数据
	 */
//	@Test
	public void selectUserByIDTest() {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		User selectUserByID = mapper.selectUserByID(1);
		System.err.println(selectUserByID);
	}

	/**
	 * 测试查询多条数据
	 */
	@Test
	public void selectUsers() {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		List<User> selectUsers = mapper.selectUsers("J%");
		System.err.println(Arrays.toString(selectUsers.toArray()));
	}
	
	/**
	 * 测试查询所有数据
	 */
	@Test
	public void selectUserAll() {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		List<User> selectUsers = mapper.selectUserAll();
		System.err.println(Arrays.toString(selectUsers.toArray()));
	}

	/**
	 * 测试新增一条数据
	 */
//	@Test
	public void addUser() {
		User user = new User();
		user.setAge(4);
		user.setName("sers");
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.addUser(user);
	}

	/**
	 * 测试修改一条数据
	 */
//	@Test
	public void updateUser() {
		User user = new User();
		user.setAge(4);
		user.setId(6);
		user.setName("sers");
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.updateUser(user);
	}

	/**
	 * 测试删除一条数据
	 */
	public void deleteUser() {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.deleteUser(6);
	}

}

package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sample.project.mybatis_core.dao.IUserMapper;
import com.sample.project.mybatis_core.model.User;

public class UserTest {
	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession openSession = sqlSessionFactory.openSession(true);;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 测试查询一条数据
	 */
	@Test
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
	 * 测试新增一条数据
	 */
	@Test
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
	@Test
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

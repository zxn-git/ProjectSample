package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.project.mybatis_core.dao.IUserMapper;
import com.sample.project.mybatis_core.model.User;

public class UserTest {
	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession openSession;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public UserTest(SqlSession openSession) {
		this.openSession = openSession;
	}

	private void close() {
		if (openSession != null) {
			openSession.close();
		}
	}

	public void selectUserByIDTest(int i) {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		User selectUserByID = mapper.selectUserByID(1);
		close();
		System.err.println(selectUserByID);
	}

	public void selectUsers(String like) {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		List<User> selectUsers = mapper.selectUsers(like);
		close();
		System.err.println(Arrays.toString(selectUsers.toArray()));
	}

	public void addUser(User user) {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.addUser(user);
		close();
	}

	public void updateUser(User user) {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.updateUser(user);
		close();
	}

	public void deleteUser(int id) {
		IUserMapper mapper = openSession.getMapper(IUserMapper.class);
		mapper.deleteUser(id);
		close();
	}


	public static void main(String[] args) {
		SqlSession openSession = sqlSessionFactory.openSession(true);
		UserTest iterfaceTest = new UserTest(openSession);
		// ---------测试查询一条数据-----------
		// iterfaceTest.selectUserByIDTest(1);
		// ---------测试查询多条数据-----------
		// iterfaceTest.selectUsers("J%");
		// ---------测试新增-----------------
		// User user = new User();
		// user.setAge(4);
		// user.setName("sers");
		// iterfaceTest.addUser(user);
		// ---------测试修改-----------------
		// User user = new User();
		// user.setAge(4);
		// user.setId(6);
		// user.setName("sers");
		// iterfaceTest.updateUser(user);
		// ---------测试删除-----------------
		 iterfaceTest.deleteUser(6);

	}
}

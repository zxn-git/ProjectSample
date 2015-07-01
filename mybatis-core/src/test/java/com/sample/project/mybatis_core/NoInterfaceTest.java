package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.project.mybatis_core.model.User;

/**
 * 没有写dao（接口）情况 根据mapping 和model 操作数据
 * 
 * @author Administrator
 *
 */
public class NoInterfaceTest {

	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = (User) sqlSession.selectOne("com.sample.project.mybatis_core.mapping.selectUserByID", 1);
		System.err.println(user.getName());
		System.err.println(user.getAge());
	}

}

package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

public class Father {

	public SqlSession openSession;

	@Before
	public void before() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// 每个线程都应该有它自己的SqlSession实例。SqlSession的实例不能共享使用，它也是线程不安全的。因此最佳的范围是请求或方法范围
		// 关闭Session很重要，你应该确保使用finally块来关闭它
		// 设置事物自动提交
		openSession = sqlSessionFactory.openSession(true);

	}

	@After
	public void after() {
		if (openSession != null) {
			openSession.close();
		}
	}
}

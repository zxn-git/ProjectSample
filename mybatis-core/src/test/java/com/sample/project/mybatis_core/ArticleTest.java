package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.project.mybatis_core.dao.IArticleMapper;
import com.sample.project.mybatis_core.model.Article;

public class ArticleTest {
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

	public ArticleTest(SqlSession openSession) {
		this.openSession = openSession;
	}

	private void close() {
		if (openSession != null) {
			openSession.close();
		}
	}

	public void selectArticleByIDOne(int id) {
		IArticleMapper mapper = openSession.getMapper(IArticleMapper.class);
		Article resultUserArticleOne = mapper.selectArticleByIDOne(id);
		System.out.println(resultUserArticleOne);
	}

	public static void main(String[] args) {
		SqlSession openSession = sqlSessionFactory.openSession(true);
		ArticleTest iterfaceTest = new ArticleTest(openSession);
		//测试一对一查询
		iterfaceTest.selectArticleByIDOne(1);
		iterfaceTest.close();
	}
}

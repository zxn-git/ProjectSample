package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sample.project.mybatis_core.dao.IArticleMapper;
import com.sample.project.mybatis_core.model.Article;
import com.sample.project.mybatis_core.model.User;

public class ArticleTest {
	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;
	// 每个线程都应该有它自己的SqlSession实例。SqlSession的实例不能共享使用，它也是线程不安全的。因此最佳的范围是请求或方法范围
	// 关闭Session很重要，你应该确保使用finally块来关闭它
	private SqlSession openSession = sqlSessionFactory.openSession(true);;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void selectArticleByIDOne() {
		IArticleMapper mapper = openSession.getMapper(IArticleMapper.class);
		Article resultUserArticleOne = mapper.selectArticleByIDOne(1);
		System.out.println(resultUserArticleOne);
	}

	// @Test
	public void selectArticleByIDTwo() {
		IArticleMapper mapper = openSession.getMapper(IArticleMapper.class);
		Article resultUserArticleOne = mapper.selectArticleByIDTwo(1);
		System.out.println(resultUserArticleOne);
	}

	// @Test
	public void selectUserArticlesOne() {
		IArticleMapper mapper = openSession.getMapper(IArticleMapper.class);
		User selectUserArticlesOne = mapper.selectUserArticlesOne(1);
		System.out.println(selectUserArticlesOne);
		for (Article article : selectUserArticlesOne.getArticles()) {
			System.out.println(article.getTitle());
		}
	}

	@Test
	public void selectUserArticlesTwo() {
		IArticleMapper mapper = openSession.getMapper(IArticleMapper.class);
		User selectUserArticlesOne = mapper.selectUserArticlesTwo(1);
		System.out.println(selectUserArticlesOne);
		for (Article article : selectUserArticlesOne.getArticles()) {
			System.out.println(article.getTitle());
		}
	}
}

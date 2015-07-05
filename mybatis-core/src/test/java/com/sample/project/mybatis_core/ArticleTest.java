package com.sample.project.mybatis_core;

import org.junit.Test;

import com.sample.project.mybatis_core.dao.IArticleMapper;
import com.sample.project.mybatis_core.model.Article;
import com.sample.project.mybatis_core.model.User;

public class ArticleTest extends Father {

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

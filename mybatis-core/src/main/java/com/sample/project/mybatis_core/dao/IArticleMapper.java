package com.sample.project.mybatis_core.dao;

import com.sample.project.mybatis_core.model.Article;
import com.sample.project.mybatis_core.model.User;

public interface IArticleMapper {

	public Article selectArticleByIDOne(int id);

	public Article selectArticleByIDTwo(int id);

	public User selectUserArticlesOne(int usreId);
	
	public User selectUserArticlesTwo(int usreId);
}

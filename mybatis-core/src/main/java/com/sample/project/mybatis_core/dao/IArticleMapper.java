package com.sample.project.mybatis_core.dao;

import com.sample.project.mybatis_core.model.Article;

public interface IArticleMapper {

	public Article selectArticleByIDOne(int id);

	public Article selectArticleByIDTwo(int id);

}

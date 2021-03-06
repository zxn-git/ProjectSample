package com.sample.project.mybatis_core.dao;

import java.util.List;

import com.sample.project.mybatis_core.model.Article;
import com.sample.project.mybatis_core.model.User;

public interface IUserMapper {
	
	public User selectUserByID(int id);
	
	public List<User> selectUsers(String name);

	public List<User> selectUserAll();
	
	public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(int id);
	
	public List<Article> getUserArticles(int id);
}

package com.sample.project.mybatis_core.dao;

import java.util.List;

import com.sample.project.mybatis_core.model.Article;
import com.sample.project.mybatis_core.model.User;

public interface IUserMapper {
	
	public User selectUserByID(int id);
	
	public List<User> selectUsers(String name);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
	public List<Article> getUserArticles(int id);
}

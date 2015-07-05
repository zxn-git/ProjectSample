package com.sample.project.spring_service.service;

import java.util.List;

import com.sample.project.mybatis_core.model.User;


public interface IUserService {

	List<User> getAll();
	
	User selectByPrimaryKey(int id);
	
    int insert(User user);
    
    int update(User user);
   
    int delete(int id);
}

package com.sample.project.spring_service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.project.mybatis_core.model.User;
import com.sample.project.spring_service.service.IUserService;

public class UserServiceTest {

	private IUserService iUserService;

	@Before
	public void before() {
		@SuppressWarnings("all")
		// 使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
		// 从Spring容器中根据bean的id取出我们要使用的userService对象
		iUserService = (IUserService) ac.getBean("userServiceIMPL");
	}

	@Test
	public void test() {
		List<User> all = iUserService.getAll();
		for (User user : all) {
			System.err.println(user);
		}
	}
	
	@After
	public void after(){
		
	}
}

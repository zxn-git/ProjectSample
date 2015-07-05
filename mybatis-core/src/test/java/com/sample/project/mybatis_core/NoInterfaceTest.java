package com.sample.project.mybatis_core;

import com.sample.project.mybatis_core.model.User;

/**
 * 没有写dao（接口）情况 根据mapping 和model 操作数据
 * 
 * @author Administrator
 *
 */
public class NoInterfaceTest extends Father{


	/**
	 * 测试这个方法，需要将User.xml 作如下修改 <mapper
	 * namespace="com.sample.project.mybatis_core.mapping">
	 */
	// @Test
	public void selectOne() {
		User user = (User) openSession.selectOne("com.sample.project.mybatis_core.mapping.selectUserByID", 1);
		System.err.println(user);
	}
}

package com.sample.project.mybatis_core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

/**
 * 没有写dao（接口）情况 根据mapping 和model 操作数据
 * 
 * @author Administrator
 *
 */
public class NoInterfaceTest {

	// 配置文件字节流
	private static InputStream resourceAsStream;

	private static SqlSessionFactory sqlSessionFactory;

	static {
		resourceAsStream = NoInterfaceTest.class.getResourceAsStream("");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
	}

	public static void main(String[] args) {

	}

}

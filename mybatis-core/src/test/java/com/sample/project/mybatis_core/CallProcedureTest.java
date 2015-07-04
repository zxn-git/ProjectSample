package com.sample.project.mybatis_core;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sample.project.mybatis_core.dao.ICallProcedureMapper;

public class CallProcedureTest {
	private static Reader reader;
	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession openSession = sqlSessionFactory.openSession(true);;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void CallProcedure(){
		ICallProcedureMapper mapper = openSession.getMapper(ICallProcedureMapper.class);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("inPara", 0);
		map.put("outPara", 0);
		mapper.getCount(map);
		System.err.println(map.get("outPara"));
	}
}

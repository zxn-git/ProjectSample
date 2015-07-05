package com.sample.project.mybatis_core;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sample.project.mybatis_core.dao.ICallProcedureMapper;

public class CallProcedureTest extends Father{
	
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

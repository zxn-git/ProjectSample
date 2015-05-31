package com.chocolate.webservice.main;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import com.chocolate.webservice.cxfinterceptor.InterceptroIMPL;

public class MainRun {

	public static void main(String[] args){
		String address = "http://10.228.64.178:8989/day01_ws/datatypews";
		Endpoint  endpo = Endpoint.publish(address, new InterceptroIMPL());
		
		//接收请求的服务器端对象
		EndpointImpl endIm = (EndpointImpl)endpo;
		//服务器端的日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = endIm.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		//服务器的日志出拦截器
		List<Interceptor<? extends Message>> outInterceptors = endIm.getOutInterceptors();
		outInterceptors.add(new LoggingOutInterceptor());
		
		System.err.println("server启动成功");
		
	}
}

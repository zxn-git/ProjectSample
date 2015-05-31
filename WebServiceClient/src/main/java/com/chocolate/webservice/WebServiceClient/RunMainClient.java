package com.chocolate.webservice.WebServiceClient;

import java.util.Arrays;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import com.chocolate.webservice.cxfinterceptor.IInterceptorDemo;
import com.chocolate.webservice.cxfinterceptor.InterceptroIMPLService;
import com.chocolate.webservice.cxfinterceptor.Student;

public class RunMainClient {
	
	public static void main(String[] args){
		InterceptroIMPLService factory = new  InterceptroIMPLService();
		IInterceptorDemo inter = factory.getInterceptroIMPLPort();
		
		//发送请求的客户端对象
		Client client = ClientProxy.getClient(inter);
		//客户端的日志出拦截器
		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
		outInterceptors.add(new LoggingOutInterceptor());
		//客户端的日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		
		List<Student> list = inter.getAllStudent();
		System.out.print(Arrays.toString(list.toArray()));
	}

}

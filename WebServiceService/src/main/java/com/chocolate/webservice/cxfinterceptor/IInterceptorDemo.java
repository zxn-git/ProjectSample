package com.chocolate.webservice.cxfinterceptor;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.chocolate.webservice.vo.Student;

@WebService
public interface IInterceptorDemo {
	
	@WebMethod
	public boolean addStudent(Student s);

	@WebMethod
	public Student getStudent();

	@WebMethod
	public List<Student> getAllStudent();
}

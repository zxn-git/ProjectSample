package com.chocolate.webservice.cxfinterceptor;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.chocolate.webservice.vo.Student;

@WebService
public class InterceptroIMPL implements IInterceptorDemo {

	public Student getStudent() {
		return new Student("小张", "男", 13);
	}

	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("xiaowang", "男", 23));
		list.add(new Student("lisan", "女", 24));
		return list;
	}

	public boolean addStudent(Student s) {
		System.out.println(s);
		return true;
	}

}

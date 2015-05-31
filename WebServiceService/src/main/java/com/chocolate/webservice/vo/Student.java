package com.chocolate.webservice.vo;

public class Student {
	private String name ;
	private String sex;
	private int age;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public Student(){
		super();
	}
	
	public Student(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

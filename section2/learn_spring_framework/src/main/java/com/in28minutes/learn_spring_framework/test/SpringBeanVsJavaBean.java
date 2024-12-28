package com.in28minutes.learn_spring_framework.test;

import java.io.Serializable;

class Pojo {
	
	private String text;
	
	private int number;
	
	public String toString() {
		return text + ":" + number;
	}
	
}

class JavaBean implements Serializable {	// EJB : Enterprise Java Bean
	
	// 1. public no-arg constructor
	public JavaBean() { // 명시적으로 추가함.
	
	}
	
	private String text;
	
	private int number;
	
	// 2. getters and setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class SpringBeanVsJavaBean {
	
	public static void main(String[] args) {
		
		Pojo pojo = new Pojo();
		
		System.out.println(pojo);
		
		JavaBean javaBean = new JavaBean();
		System.out.println(javaBean.getNumber());
	}
	
}

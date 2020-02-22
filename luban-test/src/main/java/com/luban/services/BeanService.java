package com.luban.services;

import com.luban.annotation.LubanMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class BeanService {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

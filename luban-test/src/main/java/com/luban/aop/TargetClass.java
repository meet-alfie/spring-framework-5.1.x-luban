package com.luban.aop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TargetClass {

	@PostConstruct
	public void init(){
		System.out.println("TargetClass init");
	}

	public void testAop(){
		System.out.println("TargetClass logic---");
	}

}

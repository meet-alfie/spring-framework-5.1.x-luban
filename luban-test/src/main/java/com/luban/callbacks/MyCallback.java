package com.luban.callbacks;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class MyCallback  implements InitializingBean {

	public MyCallback(){
		System.out.println("MyCallback init");
	}

	@PostConstruct
	public void xx(){
		System.out.println("@PostConstruct");
	}

	public void init(){
		System.out.println("init...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyCallback afterPropertiesSet");
	}
}

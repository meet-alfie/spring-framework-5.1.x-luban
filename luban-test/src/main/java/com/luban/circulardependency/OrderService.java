package com.luban.circulardependency;

import com.luban.aop.Luban;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Luban
public class OrderService  implements I{

	@Autowired
	ProductService productService;

	public OrderService(){
		System.out.println("orderService");
	}

	public void testAop(){
		System.out.println("testAop");
	}

	public String tetstAopWithArgs(String args){
		System.out.println("tetstAopWithArgs");
		return args;
	}

}

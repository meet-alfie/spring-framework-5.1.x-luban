package com.luban.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	@Autowired
	ProductService productService;

	public OrderService(){
		System.out.println("orderService");
	}
}

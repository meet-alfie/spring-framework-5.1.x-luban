package com.luban.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

	@Autowired
	OrderService orderService;

	public ProductService(){
		System.out.println("productService");
	}
}

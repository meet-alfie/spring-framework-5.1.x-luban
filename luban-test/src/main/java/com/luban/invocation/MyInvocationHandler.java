package com.luban.invocation;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler  implements InvocationHandler {

	private  Object target;

	public MyInvocationHandler(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 这个proxy什么？？？
		// 目标对象的方法 之前
		Select select = method.getAnnotation(Select.class);
		String value[] = select.value();
		if(value[0] != null){
			System.out.println("jdbc conn and exec sql :" + value);
		}
//		System.out.println(proxy);
		// 目标对象的方法
		// 返回结果
//		Object o = method.invoke(target,args);
		// 目标对象的方法 之后
		return null;
	}
}

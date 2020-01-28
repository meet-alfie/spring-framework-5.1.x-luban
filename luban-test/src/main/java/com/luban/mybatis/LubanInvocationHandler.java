package com.luban.mybatis;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LubanInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//这里就是写代理对象的方法逻辑 相当于UserDao的实现类
		System.out.println("jdbc conn" );
		//拿到sql语句
//		这里的方法参数method就是调用的方法，可以通过该方法的注解获取到sql
		Select select = method.getAnnotation(Select.class);
		String[] sql = select.value();
		System.out.println(sql[0]);
//		这里返回值类型
		//Class<?> returnType = method.getReturnType();
		return null;
	}
}

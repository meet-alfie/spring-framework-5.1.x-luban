package com.luban.mybatis;

import java.lang.reflect.Proxy;

public class LubanFactory {
	/*
		能够得到接口的代理对象
	 */
	public static Object getMapper(Class clazz){
		// 实现jdk动态代理
//		ClassLoader loader,
//		Class<?>[] interfaces,
//				InvocationHandler
		// 拿到这个classloader有什么用？
		Class[] classes = new Class[]{clazz};
		// 这个类文件看不到，其实就是像这里写的UserDaoImpl.java
		Object o = Proxy.newProxyInstance(LubanFactory.class.getClassLoader(),classes, new LubanInvocationHandler());
		return o;
	}
}

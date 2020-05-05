package com.luban.config;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("proxy logic ");
//		调用目标方法，得到目标方法结果
		Object returnValue = methodProxy.invokeSuper(o, objects);
		System.out.println("proxy logic ");
		return returnValue;
	}
}

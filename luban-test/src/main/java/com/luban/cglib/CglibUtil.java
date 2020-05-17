package com.luban.cglib;

import com.luban.circulardependency.OrderService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibUtil {

	public static Object getProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(OrderService.class);
		enhancer.setUseFactory(false);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				aop逻辑
				System.out.println("cglib --- aop ----");
//				调用父类方法
				Object result = methodProxy.invokeSuper(o, objects);
				return result;
			}
		});
		Object o = enhancer.create();
		return o;
	}
}

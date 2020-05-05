package com.luban.config;

import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
//import org.springframework.context.annotation.ConfigurationClassEnhancer;

import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {

		Enhancer enhancer = new Enhancer();
//		这里设置代理的目标类型（通过指定父类方式）
		enhancer.setSuperclass(E.class);
//		enhancer.setCallbackFilter(new CallbackFilter() {
//			@Override
//			public int accept(Method method) {
//				return 0;
//			}
//		});
//		这个方法参数接受CallBack,可以实现它的子类MethodInterceptor，封装代理逻辑
		enhancer.setCallback(new MyMethodInterceptor());
//		enhancer.setCallbacks(new Callback[]{new MyMethodInterceptor()});
//		代理逻辑传入
//		enhance.setLogic("----------proxy logic");
//		Exception in thread "main" java.lang.IllegalStateException: createClass does not accept callbacks
		E proxy = (E) enhancer.create();
//		Class<?> subclass = enhancer.createClass();
//		E e = new E();
//		代理对象e是通过类subclass产生，而subclass是通过Enhancer产生
//		那么这个e产生什么样子，是由Enhancer设置
//		这个e是代理对象，而这里的E是向上转型，其实对应的代理类就是这里的ProxyE
//		E cglib = (E) subclass.newInstance();
		proxy.targetMethod();

//		enhancer.setSuperclass(configSuperClass);
//		enhancer.setInterfaces(new Class<?>[] {ConfigurationClassEnhancer.EnhancedConfiguration.class});
//		enhancer.setUseFactory(false);
//		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//		enhancer.setStrategy(new ConfigurationClassEnhancer.BeanFactoryAwareGeneratorStrategy(classLoader));
//		enhancer.setCallbackFilter(CALLBACK_FILTER);
//		enhancer.setCallbackTypes(CALLBACK_FILTER.getCallbackTypes());
//		return enhancer;
	}
}

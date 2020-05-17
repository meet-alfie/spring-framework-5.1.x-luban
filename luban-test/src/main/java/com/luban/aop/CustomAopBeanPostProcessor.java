package com.luban.aop;

import com.luban.cglib.CglibUtil;
import com.luban.circulardependency.OrderService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomAopBeanPostProcessor  implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		这里所有bean都会处理，可以通过条件过滤指定bean处理
		if(bean instanceof OrderService){
//			因为这个类没有实现接口，不能用jdk动态代理，只能用cglib
//			这个逻辑是程序员提供的，spring不是直接写死逻辑，而是找到@Aspect获取aop逻辑
//			通过切点植入可以，完成方法之前、之后的逻辑添加
			bean = CglibUtil.getProxy();
		}
		return bean;
	}
}

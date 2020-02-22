package com.luban.config;

import com.luban.services.LubanService;
import com.luban.services.ZlService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/*
	这个类的执行时机：
	在扫描和解析之后
	invokeBeanFactoryPostProcessor哪里执行
	遍历beandefinitionmap实例化beanf即finishBeanFactoryInitialization之前
 */
//@Component
public class ZiluBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("lubanService");
//		beanDefinition.setAutowireMode(3);
		System.out.println(beanDefinition.getAutowireMode());
	}
}

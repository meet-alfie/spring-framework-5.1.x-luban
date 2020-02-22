package com.luban.beanDefinition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

public class MyScanner extends ClassPathBeanDefinitionScanner {

	public MyScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(includeFilter);
	}
}

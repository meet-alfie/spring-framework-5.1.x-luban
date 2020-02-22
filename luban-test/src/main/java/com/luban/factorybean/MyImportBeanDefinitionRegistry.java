package com.luban.factorybean;

import com.luban.beanDefinition.MyScanner;
import com.luban.factorybean.MyFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		通过自定义的扫描器
//		MyScanner scanner = null;
//		List<BD> list = scanner.scan("com.luban")
//		扫描出的所有dao, 这里会拿到两个tdao
//		for (dao:
//			 list) {
//			针对每个dao生成一个gbd, 每个gbd对应一个MyFactoryBean
//			这里new了两个fb，分别产生相应的代理对象
//			GenericBd gbd = new GenericBeanDefinition(fb);
//			gbd.getPropertyValues().add(dao);
//
//		}
	}
}

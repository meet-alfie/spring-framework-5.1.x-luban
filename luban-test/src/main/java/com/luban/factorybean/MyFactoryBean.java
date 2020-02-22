package com.luban.factorybean;

import com.luban.services.BeanService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.stereotype.Component;

public class MyFactoryBean implements FactoryBean {

	Class mapperInterface;

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		// 根据接口实例化代理对象
		return Proxy.newProxyInstance(null,null,null);
//		return new BeanService();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanService.class;
	}
}

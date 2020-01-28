package com.luban.config;

import com.luban.services.LubanService;
import com.luban.services.ZlService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.luban")
//@EnableAspectJAutoProxy
public class Appconfig {

//	@Bean
//	public ZlService zlService(){
//		return new ZlService();
//	}
//
//	@Bean
//	public LubanService lubanService(ZlService zlService){
//		return new LubanService(zlService);
//	}
}

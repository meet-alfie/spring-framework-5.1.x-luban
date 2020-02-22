package com.luban.config;

import com.luban.services.LubanService;
import com.luban.services.ZlService;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.*;

//@Configuration
@ComponentScan(value = "com.luban"
//		,excludeFilters =
		// 不使用默认的类扫描过滤器
//		,useDefaultFilters = false
)
//Invalid default: public abstract java.lang.Class org.mybatis.spring.annotation.MapperScan.factoryBean()
@MapperScan("com.luban.mapper")
//@EnableAspectJAutoProxy
//@ImportResource("classpath:spring.xml")
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

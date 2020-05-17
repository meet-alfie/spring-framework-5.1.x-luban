package com.luban.config;

import com.luban.aop.CustomAopBeanPostProcessor;
import com.luban.services.LubanService;
import com.luban.services.ZlService;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.*;

//@Configuration
@ComponentScan(value = {"com.luban.circulardependency","com.luban.aop"}
//		,excludeFilters =
		// 不使用默认的类扫描过滤器
//		,useDefaultFilters = false
)
//Invalid default: public abstract java.lang.Class org.mybatis.spring.annotation.MapperScan.factoryBean()
//@MapperScan("com.luban.mapper")
//@EnableAspectJAutoProxy
//@ImportResource("classpath:spring.xml")
//proxyTargetClass = true 表示强制使用cglib
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//处理aop的bean后置处理器引入,类上就不用加@Component(通过扫描机制注入)
//@Import(CustomAopBeanPostProcessor.class)
@Configuration
public class Appconfig {

//	@Bean
//	public E getE(){
//		System.out.println("e init");
//		return new E();
//	}
//
//	//	先执行f,看f调用e的逻辑
//	@Bean
//	public F f(){
//		System.out.println("f init");
//		getE();
//		return new F();
//	}



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

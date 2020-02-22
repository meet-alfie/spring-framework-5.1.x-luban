package com.luban.test;

import com.luban.annotation.LubanMapper;
import com.luban.beanDefinition.LubanBeanFactoryPostProcessor;
import com.luban.beanDefinition.MyScanner;
import com.luban.config.Appconfig;
import com.luban.factorybean.MyFactoryBean;
import com.luban.invocation.MyInvocationHandler;
import com.luban.mapper.UserDao;
import com.luban.proxy.LubanProxy;
import com.luban.services.*;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		//初始化spring容器
//		1.javaConfig方式
//		AnnotationConfigApplicationContext ac  =
//				new AnnotationConfigApplicationContext(Appconfig.class);


 		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext();
		ac.register(Appconfig.class);
//		ac.addBeanFactoryPostProcessor(new LubanBeanFactoryPostProcessor());
		ac.refresh();
//		ac.scan("com.luban");
////		ac.start();
//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClass(BeanService.class);
//		beanDefinition.setScope("singleton");
//		ac.registerBeanDefinition("xx",beanDefinition);
		// 真实BD
		// 模板 设置抽象
//		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
//		rootBeanDefinition.getPropertyValues().add("name","zilu");
////		rootBeanDefinition.setBeanClass(BeanService.class);
//		rootBeanDefinition.setAbstract(true);
//
//		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("bs");
//		childBeanDefinition.setBeanClass(IndexService.class);
//
//		ac.registerBeanDefinition("bs",rootBeanDefinition);
//		ac.registerBeanDefinition("is",childBeanDefinition);
//		ac.refresh();
//		System.out.println(ac.getBean(MyLookup1.class));
//		System.out.println(ac.getBean(MyLookup1.class));
//		System.out.println(ac.getBean(MyLookup1.class).xx());
//		System.out.println(ac.getBean(MyLookup1.class).xx());

//		BeanDefinitionRegistry  AnnotationConfigRegistry
//		MyScanner scanner = new MyScanner(ac);
//		scanner.addIncludeFilter(new AnnotationTypeFilter(LubanMapper.class));
//		int scan = scanner.scan("com.luban");
//		System.out.println(scan);


//		System.out.println(ac.getBean(BeanService.class));
//		System.out.println(ac.getBean(IndexService.class).getName());
//		System.out.println(ac.getBean("xx"));
//		ac.getBean(LubanService.class).xx();
		//com.luban.services.BeanService@1c655221
//		System.out.println(ac.getBean("myFactoryBean"));
//		com.luban.factorybean.MyFactoryBean@58d25a40
//		System.out.println(ac.getBean("&myFactoryBean"));
		//com.luban.services.QueryDaoImpl@1b701da1
//		System.out.println(ac.getBean(QueryDao.class));


//		2.xml方式
//		ClassPathXmlApplicationContext cc =
//				new ClassPathXmlApplicationContext("classpath:spring.xml");
//				cc.getBean(LubanService.class).xx();
//		LubanService bean = classPathXmlApplicationContext.getBean(LubanService.class);
//		System.out.println(bean);
//		System.out.println(bean.getZlService());



//		DataSource dataSource = null;
////		DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
//		TransactionFactory transactionFactory =
//				new JdbcTransactionFactory();
//		Environment environment =
//				new Environment("development", transactionFactory, dataSource);
//		Configuration configuration = new Configuration(environment);
//		// DAO 一般是个接口
//		configuration.addMapper(UserDao.class);
////		configuration.addMapper(BlogMapper.class);
//		SqlSessionFactory sqlSessionFactory =
//				new SqlSessionFactoryBuilder().build(configuration);
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 接口实现类 是个代理
//		UserDao mapper = sqlSession.getMapper(UserDao.class);

		// 能够得到一个实现了UserDao的代理对象
//		UserDao userDao = (UserDao) LubanFactory.getMapper(UserDao.class);
		// 完成数据库的查询功能
//		userDao.query();

//		UserService service = (UserService) LubanProxy.getInstance(UserService.class);

//		UserService target = new UserServiceImpl();
//		UserService proxy = new $ProxyLuban(target);
//		proxy.update("hello");
//		UserDao userDao = new UserDaoImpl();
//		UserDao proxy = (UserDao) LubanProxy.getInstance(userDao);
//		proxy.query("5");

//		UserDao target = new UserDaoImpl();
//		UserDao proxy = new $ProxyLuban(target);
//		proxy.query();

//		QueryDao target = new QueryDaoImpl();
//		InvocationHandler invocationHandler = new MyInvocationHandler(target);
//		QueryDao proxy = (QueryDao) LubanProxy.getInstance(target
//				,invocationHandler
//		);
//		proxy.query();


//		UserDao o = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserDao.class}, new MyInvocationHandler());
//		o.query("10");

	}
}

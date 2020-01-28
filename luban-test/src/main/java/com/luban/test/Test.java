package com.luban.test;

import com.luban.config.Appconfig;
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

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		//初始化spring容器
//		1.javaConfig方式
//		AnnotationConfigApplicationContext ac  =
//				new AnnotationConfigApplicationContext(Appconfig.class);
//		ac.start();
//		ac.getBean(LubanService.class).xx();


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
		UserDao userDao = new UserDaoImpl();
		UserDao proxy = (UserDao) LubanProxy.getInstance(userDao);
		proxy.query("5");

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

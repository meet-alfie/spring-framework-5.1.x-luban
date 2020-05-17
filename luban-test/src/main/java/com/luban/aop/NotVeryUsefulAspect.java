//package com.luban.aop;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component//添加这个才会生效，作为aspect
//@Aspect
//public class NotVeryUsefulAspect {
//	//	切点：找出来com.luban.circulardependency包下OrderService的所有方法
//	@Pointcut("within(com.luban.circulardependency.OrderService)")
//	private void anyOldTransfer() {
//	}
//
//	@Pointcut("execution(public * com.luban.circulardependency.*(..))")
//	private void pointCutExecutionAny() {
//	}
//
//	@Pointcut("args(java.lang.String)")
//	private void pointCutExecutionArgs() {
//	}
//
//	@Pointcut("within(com.luban.circulardependency)")
//	private void pointCutWithin() {
//	}
//
//	@Pointcut("this(com.luban.circulardependency.I)")
//	private  void PointCutThis(){}
//
//	@Pointcut("target(com.luban.circulardependency.OrderService)")
//	private  void PointCutTarget(){}
//
////	针对添加了@Luban注解的类生效
//	@Pointcut("@within(com.luban.aop.Luban)")
//	private  void PointCutAnnoWith(){}
//
//	//	通知： 在那个切点上什么时机，执行什么代理逻辑
////	@Before("anyOldTransfer()")
////	@Before("pointCutExecutionAny() && pointCutExecutionArgs()")
////	@Before("pointCutExecutionAny() &&! pointCutExecutionArgs()")
////	@Before("PointCutThis")
////	@Before("PointCutTarget")
////	@Before("PointCutAnnoWith")
//	@Before("pointCutExecutionAny")
//	public void doAccessCheck() {
//		System.out.println("aop ---");
//	}
//}

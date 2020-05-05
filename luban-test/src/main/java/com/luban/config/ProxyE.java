package com.luban.config;

//E 通过Enhance的superClass得到

public class ProxyE extends  E {
//	 包含代理逻辑的对象a通过代理类构造方法传入进来,用cglib的话，这个就是MethodInterceptor
//	A a;
//	public void setA(A a){
//		a = a;
//	}

//	遍历E属性和方法得到
	@Override
	public void targetMethod() {

//		System.out.println("-----------------代理逻辑，但是这里一般不会写死，需要外部传入代理逻辑");
//		super.targetMethod();

//		一般传入一个对象，而这个对象实现某个接口，实现接口方法完成代理逻辑
//		通过这个对象调用上面接口方法完成代理逻辑
//		a --imp I { method m(xx)}--> a.m(xx)
	}
}

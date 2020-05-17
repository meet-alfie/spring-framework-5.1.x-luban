package com.luban.synthetic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class SyntheticTest {

//	如果想要外部类访问内部类私有变量

	public void test(){
		SyntheticTestInner inner = new SyntheticTestInner();
		System.out.println(inner.i);
//		其实调用
//		System.out.println(inner.accept$000());
	}
//	正常java,外部类不能访问内部类的私有变量
	class SyntheticTestInner{
//		内部类可以访问外部私有变量
		private int i;
//		java原则，一般类的私有构造方法，不能直接外部new
//		但是特殊类，比如内部类，可以添加私有构造方法后，为了让外部类new内部类，就会多出来一个合成类
		private SyntheticTestInner(){}
//		自己就会多出来这个方法，这个方法就是合成方法
//		public int accept$000(){
//			return i;
//		}
	}

	public static void main(String[] args) {
		System.out.println("test");
		int i = 0;
		for (Constructor<?> constructor : SyntheticTestInner.class.getConstructors()) {
			for (Parameter parameter : constructor.getParameters()) {
				System.out.println("------------" + i);
				System.out.println(parameter.getType());
			}
			i++;
		}
		for (Method declaredMethod : SyntheticTestInner.class.getDeclaredMethods()) {
			//accept$000,这个方法就是合成方法
			System.out.println(declaredMethod.getName());
		}
	}

}

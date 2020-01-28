package com.luban.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class LubanProxy {

	public static Object getInstance(Object target
//			, InvocationHandler invocationHandler
	) {

		Object proxy = null;
		// 获取代理程序内容
		//目标对象
		Class targetInf = target.getClass().getInterfaces()[0];
//		Class invInf = invocationHandler.getClass().getInterfaces()[0];
//		Class invocationInf = invocationHandler.getClass();
//		Class targetInf = target;
		Method methods[] = targetInf.getDeclaredMethods();
		String line = "\n";
		String tab = "\t";
		String infName = targetInf.getSimpleName();
//		String invName = invInf.getSimpleName();
		String content = "";
		String packageContent = "package com.google;" + line;
		String importContent = "import " + targetInf.getName() + ";" + line;
//		String importContent2 = "import " + invInf.getName() + ";" + line;
//		String importContent3 = "import java.lang.reflect.Proxy;" + line;
		String claxxFirstLineContent = "public class $ProxyLuban implements " + infName + "{" + line;
		String filedContent = tab + "private " + infName + " target;" + line;
//		String filedContent2 = tab + "private " + invName + " invocationHandler;" + line;
		String constructorContent = tab + "public $ProxyLuban ("
				+ infName + " target"
//				+ "," + invName + " invocationHandler"
				+ ") {" + line
				+ tab + tab + "this.target = target;" + line
//				+ tab + tab + "this.invocationHandler = invocationHandler;" + line
				+ tab + "}" + line;
		String methodContent = "";
		for (Method method : methods) {
			String returnTypeName = method.getReturnType().getSimpleName();
			String methodName = method.getName();
			// String.class String.class
			Class args[] = method.getParameterTypes();
			String argsContent = "";
			String paramsContent = "";
			int flag = 0;
			for (Class arg : args) {
				String temp = arg.getSimpleName();
				// String
				// String p0, String p1,
				argsContent += temp + " p" + flag + ",";
				// p0,p1,
				paramsContent += "p" + flag + ",";
				flag++;
			}
			if (argsContent.length() > 0) {
				argsContent = argsContent.substring(0, argsContent.lastIndexOf(","));
				paramsContent = paramsContent.substring(0, paramsContent.lastIndexOf(","));
			}
//			Object invoke(Object proxy, Method method, Object[] args)
			methodContent = tab + "public " + returnTypeName + " " + methodName + "(" + argsContent + ") {" + line
					+ tab + tab + "System.out.println(\"log\");" + line
					+ tab + tab + "target." + methodName + "(" + paramsContent + ");" + line
//					+ tab + tab + "Proxy.newProxyInstance($ProxyLuban.class.getClassLoader(),"  + "new Class[]{" + infName +".class},invocationHandler);" + line
					+ tab + "}" + line;

		}
		content = packageContent + importContent
//				+ importContent2
//				+ importContent3
				+ claxxFirstLineContent + filedContent
//				+ filedContent2
				+ constructorContent + methodContent + "}";
		System.out.println(content);

		// 程序内容写入文件
		File file = new File("d:\\com\\google\\$ProxyLuban.java");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			fw.write(content);
			fw.flush();
			fw.close();

			// 编译
			// JavaCompiler存在于jdk,不存在jre(不支持编译)，所以只有jre环境会报错
			// 编译器
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			// 文件管理器获取文件
			StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
			Iterable units = fileMgr.getJavaFileObjects(file);
			// 编译器和文件管理器定制任务
			JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
			t.call();
			fileMgr.close();
			// 加载 生成代理对象
//			指定url加载，注意类是包含包名的，上面的类全称是com.google.$ProxyLuban，这个是在D盘
			URL[] urls = new URL[]{new URL("file:D:\\\\")};
			URLClassLoader urlClassLoader = new URLClassLoader(urls);
			Class clazz = urlClassLoader.loadClass("com.google.$ProxyLuban");
			System.out.println(clazz);
			// 所有代理对象的构造方法参数都是接口类型，这里也可以看出，jdk动态代理是基于聚合的
//			Constructor constructor = clazz.getConstructor(new Class[]{targetInf
//					, invInf
//			});
			Constructor constructor = clazz.getConstructor(targetInf);
			proxy = constructor.newInstance(target);
//			proxy = constructor.newInstance(target, invocationHandler);
			// 这个只是用的无参构造方法生成对象
			// clazz.newInstance();
			// 只能加载当前项目类路径下class
			// Class.forName()
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proxy;
	}
}

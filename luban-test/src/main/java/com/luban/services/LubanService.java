package com.luban.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class LubanService {

	//	@Autowired
	Zl zlService1;

	//	LubanService(){
//
//	}
//	public LubanService(Zl zl) {
//		this.zlService1 = zl;
//	}

	public void xx() {
		System.out.println(zlService1);
	}

//	public ZlService getZlService() {
//		return zlService1;
//	}


	public void setZlService(Zl zl) {
		this.zlService1= zl;
	}
//	public void setXX(ZlService zlService11) {
//		this.zlService1 = zlService11;
//	}

}

package com.luban.services;

public class ServiceLog implements Service {

	Service target;

	public ServiceLog(Service service){
		this.target = service;
	}

	@Override
	public void query() {
		System.out.println("proxy log");
		target.query();
	}
}

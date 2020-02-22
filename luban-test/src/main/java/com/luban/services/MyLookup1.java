package com.luban.services;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract  class MyLookup1 {
	@Lookup
	public abstract ZlService2 xx();

	public void xxx(){
		ZlService2 zlService2 = xx();
		System.out.println(zlService2.hashCode());
	}
}

package com.luban.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class ZlService  implements Zl{

	public static QueryDao xxx(){
		return new QueryDaoImpl();
	}
}

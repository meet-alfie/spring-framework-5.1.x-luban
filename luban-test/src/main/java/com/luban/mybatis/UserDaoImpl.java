package com.luban.mybatis;

import com.luban.mapper.UserDao;

public class UserDaoImpl implements UserDao {
	@Override
	public void query(String id) {

//		new LubanInvocationHandler().invoke()
		System.out.println("query logic : " + id );
	}
}

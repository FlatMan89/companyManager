package com.flatman.test;

import com.flatman.bean.entity.User;

public class UserTest {

	public static void main(String[] args) {
		User u = new User();
		u.setId(1);
		u.setUsername("flatman");
		u.setPassword("123456");
		
		System.out.println(u.getUsername());
	}

}

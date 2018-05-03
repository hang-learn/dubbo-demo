package com.xiaoshuai.impl;

import com.xiaoshuai.HelloService;

public class HelloServiceImpl implements HelloService{

	public String speakHello(String name) {
		return "你好:"+name+"欢迎查阅小帅丶博客";
	}

}

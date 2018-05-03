package com.xiaoshuai.impl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderServer {
	public static void main(String[] args){
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
			context.start();
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
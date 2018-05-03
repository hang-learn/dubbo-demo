
package com.xiaoshuai;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		HelloService helloService = (HelloService) context.getBean("helloService");
		String result = helloService.speakHello("xiaoshuai");
		System.out.println(result);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
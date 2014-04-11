package com.chat.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {

	private static ClassPathXmlApplicationContext ac;

	private ApplicationContext() {

	}

	public synchronized static ClassPathXmlApplicationContext getContext() {
		if (ac == null) {
			return new ClassPathXmlApplicationContext("spring-common.xml");
		}
		return ac;
	}

}

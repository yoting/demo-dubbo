package com.gusi.demo.dubbo.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consumer {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		DemoBusiness business = (DemoBusiness) ac.getBean("demoBusiness");

		// business.business0();
		// business.business1();
		business.business2();
		// business.business3();
	}
}

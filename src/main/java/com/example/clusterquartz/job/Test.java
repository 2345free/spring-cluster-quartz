package com.example.clusterquartz.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ClusterQuartz clusterQuartz = context.getBean("clusterQuartz", ClusterQuartz.class);
		clusterQuartz.printUserInfo();

		while (true) {

		}
	}
}

package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Product;

public class TestSpring {
	
	public static void main(String[] args) {
		System.out.println("Factory is ready..");
		
/*	Resource resource = new ClassPathResource("springtest.xml");
	BeanFactory beanFactory;	
	beanFactory = new XmlBeanFactory(resource);
	
	System.out.println("Factory is ready..");
	
	Product product1 =(Product)beanFactory.getBean("prod1");

	System.out.println(product1.getProdName());
	System.out.println(product1.getProdId());
	System.out.println(product1.getProdPrice());
	
*/
}
}
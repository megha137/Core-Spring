package com.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.beans.HelloWorld;
public class TestHello {

	public static void main(String[] args)
	{
		Resource res=new ClassPathResource("HelloTest.xml");
		
		BeanFactory beanFactory;	
		beanFactory = new XmlBeanFactory(res);

		
		//beanFactory=new XmlBeanFactory(res);
		
		HelloWorld hellworld=(HelloWorld)beanFactory.getBean("hw1");
		System.out.println(hellworld.getMsg());
		
		
	}
	
}

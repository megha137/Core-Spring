package com.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.beans.Operations;


public class OperationTest
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("OperSpring.xml");
		factory.registerShutdownHook();
		System.out.println("\nContainer is Ready");
		Operations oper=(Operations)factory.getBean("opr");
		
		System.out.println("the sum of even number is:"+oper.getEvenSum());
		System.out.println("The sum of odd number is:"+oper.getOddSum());
		System.out.println("The sum of prime number is:"+oper.getPrimeSum());
		
	}	
}

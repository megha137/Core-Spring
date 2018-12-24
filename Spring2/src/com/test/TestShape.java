package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Shape;

public class TestShape
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("ShapeSpring.xml");
		factory.registerShutdownHook();
		System.out.println("\nContainer is Ready");
		Shape sh=(Shape)factory.getBean("shape");
		System.out.println("value A="+sh.getTriangle().getPointA());
		System.out.println("value B="+sh.getTriangle().getPointB());
		System.out.println("value C="+sh.getTriangle().getPointC());
		System.out.println("Value len="+sh.getRectangle().getLen());
		System.out.println("Value bre="+sh.getRectangle().getBre());
	}

}

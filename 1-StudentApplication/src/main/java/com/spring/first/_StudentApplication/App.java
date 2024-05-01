package com.spring.first._StudentApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	StudentClass std=(StudentClass)context.getBean("std");
    	std.print();

       
    }
}

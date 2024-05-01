package com.spring.first.ShoppingProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigProperty.xml");
    	OrderClass ord=(OrderClass)context.getBean("order");
    	ord.print();
    	
    
    }
}

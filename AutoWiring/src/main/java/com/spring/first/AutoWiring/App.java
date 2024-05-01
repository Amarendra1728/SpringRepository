package com.spring.first.AutoWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	First ft=(First)context.getBean("first");
    	ft.print();  
    }
}

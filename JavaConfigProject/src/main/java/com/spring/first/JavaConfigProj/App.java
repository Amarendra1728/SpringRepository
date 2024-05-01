package com.spring.first.JavaConfigProj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
     //   StudentClass sc = (StudentClass) context.getBean("getStudent");//by method
     //   StudentClass sc2 = (StudentClass) context.getBean("getStd");
        StudentClass sc = (StudentClass) context.getBean("id2");//by interface
        StudentClass sc2 = (StudentClass) context.getBean("id2");
        sc.print();
        sc2.print();
    }
}

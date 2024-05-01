package com.spring.first._EmployeeApplication;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class App 
{
    public static void main( String[] args )
    {
//    	   Resource res=new ClassPathResource("SpringConfg.xml");
//         XmlBeanFactory factory=new XmlBeanFactory(res);
//         Employee emp=(Employee) factory.getBean("details");
//         emp.print();
    	Resource res = new FileSystemResource("C:\\Users\\amare\\OneDrive\\Desktop\\FileSystem\\SpringConfg.xml.txt");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        Employee emp = (Employee) factory.getBean("details");
        emp.print();    
    }
}

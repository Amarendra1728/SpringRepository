package com.spring.first.EmployeeJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
    public Employee getEmp() {
        // Create Address object
        Address address = new Address();
        address.setContry("India");
        address.setState("Andhrapradesh");
        address.setCity("Nellore");
        
        // Create Employee object
        Employee emp = new Employee();
        emp.setId(1728);
        emp.setName("Amarendra");
        emp.setSal(35000);
        emp.setDept("JavaFresher");
        emp.setAdd(address); // Set Address object into Employee
        
        return emp;
    }
}

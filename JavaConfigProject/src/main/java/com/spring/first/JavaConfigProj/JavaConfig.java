package com.spring.first.JavaConfigProj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
@Bean("id1")
public StudentClass getStudent() {
	StudentClass std=new StudentClass();
	
	std.setId(1728); 
    std.setName("Amar"); 
    std.setLoc("India");
    return std;
}
@Bean("id2")
public StudentClass getStd() {
	StudentClass std=new StudentClass();
	std.setId(2817);
	std.setName("Aravind");
	std.setLoc("India");
	return std;
	
	}
}

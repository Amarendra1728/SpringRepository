package com.spring.first.SpringJdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentClass {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public void create()
{
	jdbcTemplate.execute("create table student(id int,name varchar2(10),course varchar2(10))");
	System.out.println("Table Created");
}

}

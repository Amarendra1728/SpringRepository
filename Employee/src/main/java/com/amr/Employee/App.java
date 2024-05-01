
package com.amr.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//EmployeeClassMethods Program
    	EmployeeClassMethods emp=new EmployeeClassMethods();
    	emp.insert(101,"Amarendra");
    	emp.print();
    	//EmployeeConstrictor Program
    	EmployeeConstructor emp1=new EmployeeConstructor(111,"Amar","Java");
    	emp1.print();
    	//Setters and Getters
    	EmployeeSetter emp2=new EmployeeSetter();
    	emp2.setEmpId(101);
    	emp2.setEmpName("Amarendra");
    	emp2.setCourse("Python");
    	emp2.print();
    }
}

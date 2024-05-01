package com.amr.Emp;
import com.amr.Emp.Interface.EmployeeImpl;
import com.amr.Emp.Interface.Student;

public class App 
{
    public static void main( String[] args )
    {
       Employee emp=new Employee("Amarendra",23,55000);
       emp.print();
       //Interface Program
       EmployeeImpl emp1=new EmployeeImpl("amar",23,34000);
       System.out.println("Employee Name: " + emp1.getName());
       System.out.println("Employee Age: " + emp1.getAge());
       System.out.println("Employee Salary: " + emp1.getSalary());
       // Update employee information using setter methods
       emp1.setName("Jane Smith");
       emp1.setAge(35);
       emp1.setSalary(60000);
       // Display updated employee information
       System.out.println("\nUpdated Employee Information:");
       System.out.println("Employee Name: " + emp1.getName());
       System.out.println("Employee Age: " + emp1.getAge());
       System.out.println("Employee Salary: " + emp1.getSalary()); 
       //Student Program
       Student std=new Student(23,"Amarendra","Java Full Stack",11,"17-dec-2023","Hyderabad");
       System.out.println("\nRoll Number:-"+std.getRollNo());
       System.out.println("Name:-"+std.getName());
       System.out.println("Batch:-"+std.getBatch());
       System.out.println("Date of join:-"+std.getDoj());
       System.out.println("Location:-"+std.getLocation());
       
      
    }
}

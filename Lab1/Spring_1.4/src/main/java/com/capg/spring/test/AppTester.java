package com.capg.spring.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;
import com.capg.spring.beans.EmployeeList;

public class AppTester {
	
	public static void main(String args[])
	{
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring-config.xml");
        Employee emp =iocContainer.getBean("emp1",Employee.class);
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the employee id");
	    int empId = sc.nextInt();
	    System.out.println("Employee Details");
	    System.out.println("---------------------");
	    for (int i=0;i<emp.getEmpList().size();) {
	    	Employee e= emp.getEmpList().get(i);
	    	if(e.getEmployeeId()==empId) {
	    		System.out.println("EmployeeID: "+e.getEmployeeId()+"\nEmployeeName: "+e.getEmployeeName()+"\nSalary: "+e.getSalary()+"\nAge: "+e.getAge());
	    	break;
	    	}
	    	else
	    	{
	    		System.out.println("Id doesnt exist");
	    		break;
	    	}
	    }
	   
	}
}

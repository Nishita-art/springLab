package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.sbu.*;
import com.capg.beans.Employee;

public class TestApp
{
	
public static void main(String[] args)
{
	ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/Employee.xml");
	

	Sbu sbu = container.getBean("Sbu",Sbu.class);
	
	System.out.println(sbu);
	
	
}
}

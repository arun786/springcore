package com.arun.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arun.bean.Employee;
import com.arun.configurations.ConfigurationClass;
import com.arun.service.EmployeeServiceImpl;

public class ClientCalling {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		EmployeeServiceImpl empSer = ctx.getBean("employeeService",EmployeeServiceImpl.class);
		Employee emp = empSer.getEmployee("4");
		System.out.println(emp);
	}

}

package com.arun.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.arun.DAO.EmployeeDAO;
import com.arun.DAO.EmployeeDAOImpl;
import com.arun.service.EmployeeService;
import com.arun.service.EmployeeServiceImpl;

@Configuration
public class ConfigurationClass {

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/tcrmd00");
		dm.setUsername("root");
		dm.setPassword("root");

		return dm;
	}

	@Bean(name = "employee")
	public EmployeeDAO getData() {
		EmployeeDAO emp = new EmployeeDAOImpl(getDataSource());
		return emp;
	}

	@Bean(name = "employeeService")
	public EmployeeService getDataFromSerice() {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		emp.setEmployeeDAO(getData());
		return emp;
	}

}

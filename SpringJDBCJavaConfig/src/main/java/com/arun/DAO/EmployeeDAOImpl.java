package com.arun.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.arun.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	private final String GET_SQL = "select id, name, salary from employee where id = ?";

	public EmployeeDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public Employee getEmployee(String id) {
		Employee emp = jdbcTemplate.queryForObject(GET_SQL, new Object[] { id }, new EmployeeMapper());
		return emp;
	}

	private static final class EmployeeMapper implements RowMapper<Employee> {

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getString(3));
			return emp;
		}

	}

}

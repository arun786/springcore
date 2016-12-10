package com.arun.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.arun.bean.Product;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_SQL = "insert into product (id, name, description,price) values (?,?,?,?)";
	private final String UPDATE_SQL = "update product set name = ?,description = ?, price = ? where id = ? ";

	public ProductDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public void create(Product product) {

		int result = jdbcTemplate.update(UPDATE_SQL, product.getName(), product.getDescription(), product.getPrice(),
				product.getId());
		if (result == 0) {
			result = jdbcTemplate.update(INSERT_SQL, product.getId(), product.getName(), product.getDescription(),
					product.getPrice());
		}

	}

}

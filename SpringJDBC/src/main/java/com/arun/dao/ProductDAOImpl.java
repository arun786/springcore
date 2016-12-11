package com.arun.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.arun.bean.Product;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_SQL = "insert into product (id, name, description,price) values (?,?,?,?)";
	private final String UPDATE_SQL = "update product set name = ?,description = ?, price = ? where id = ? ";
	private final String GET_SQL = "select id,name,description,price from product where id=?";
	private final String GET_ALL_SQL = "select id, name, description, price from product";

	public ProductDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public void insertOrUpdateProduct(Product product) {

		int result = jdbcTemplate.update(UPDATE_SQL, product.getName(), product.getDescription(), product.getPrice(),
				product.getId());
		if (result == 0) {
			result = jdbcTemplate.update(INSERT_SQL, product.getId(), product.getName(), product.getDescription(),
					product.getPrice());
		}

	}

	public Product getProduct(Product prod) {
		Product result = jdbcTemplate.queryForObject(GET_SQL, new Object[] { prod.getId() }, new ProductMapper());
		return result;
	}

	public List<Product> getProducts() {
		List<Product> results = jdbcTemplate.query(GET_ALL_SQL, new ProductMapper());
		return results;
	}

	private static final class ProductMapper implements RowMapper<Product> {

		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product prod = new Product();
			prod.setId(rs.getString(1));
			prod.setName(rs.getString(2));
			prod.setDescription(rs.getString(3));
			prod.setPrice(rs.getBigDecimal(4));
			return prod;
		}
	}

}

package com.arun.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.arun.bean.Product;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_SQL = "insert into product (id, name, description,price) values (?,?,?,?)";
	private final String UPDATE_SQL = "update product set name = ?,description = ?, price = ? where id = ? ";
	private final String GET_SQL = "select id,name,description,price from product where id=?";
	private final String GET_ALL_SQL = "select id, name, description, price from product";
	private final String GET_BETWEEN_SQL = "select id, name , description, price from product where id between ? and ?";
	private NamedParameterJdbcTemplate namedParameterJDBCTemplate;
	private final String INSERT_SQL_NAMED = "insert into product (id, name, description,price) values (:id,:name,:description,:price)";
	private final String UPDATE_SQL_NAMED = "update product set name = :name,description = :description, price = :price where id = :id ";

	public ProductDAOImpl(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
		namedParameterJDBCTemplate = new NamedParameterJdbcTemplate(ds);
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

	public List<Product> getProductsInBetween(String startId, String endId) {
		List<Product> results = jdbcTemplate.query(GET_BETWEEN_SQL, new Object[] { startId, endId },
				new ProductMapper());
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

	public void InsertOrUpdateProductUsingNamedParameter(Product product) {
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id", product.getId())
				.addValue("name", product.getName()).addValue("description", product.getDescription())
				.addValue("price", product.getPrice());
		int result = 0;
		result = namedParameterJDBCTemplate.update(UPDATE_SQL_NAMED, sqlParameterSource);
		if (result == 0) {
			result = namedParameterJDBCTemplate.update(INSERT_SQL_NAMED, sqlParameterSource);
		}

	}

}

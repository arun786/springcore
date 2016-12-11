package com.arun.dao;

import java.util.List;

import com.arun.bean.Product;

public interface ProductDAO {

	public void insertOrUpdateProduct(Product product);
	public Product getProduct(Product product);
	public List<Product> getProducts();
	public List<Product> getProductsInBetween(String startId, String endId);

}

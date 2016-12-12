package com.arun.main;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.bean.Product;
import com.arun.dao.ProductDAO;
import com.arun.dao.ProductDAOImpl;

public class NamedMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ProductDAO dao = ctx.getBean("dao",ProductDAOImpl.class);
		Product product = new Product();
		product.setId("P901");
		product.setName("Laptop");
		product.setDescription("New Lenovo Laptops");
		product.setPrice(new BigDecimal("6000"));
		dao.InsertOrUpdateProductUsingNamedParameter(product);
	}

}

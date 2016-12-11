package com.arun.main;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.bean.Product;
import com.arun.dao.ProductDAO;
import com.arun.dao.ProductDAOImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ProductDAO dao = ctx.getBean("dao", ProductDAOImpl.class);
		Product prod = new Product();
		prod.setId("P286");
		prod.setName("Wipes/Soap");
		prod.setDescription("Used for Baby/Kid");
		prod.setPrice(new BigDecimal("50"));
		dao.insertOrUpdateProduct(prod);
		System.out.println("Insertion/updation successful");

		// to retrieve the value from Database when we pass the Id
		System.out.println(dao.getProduct(prod));

		System.out.println("--------------------------------------------");
		// To retrieve all the records from database
		List<Product> lst = dao.getProducts();
		for (Product p : lst) {
			System.out.println(p);
		}
		
		System.out.println("--------------------------------------------");
		//to retrieve data using between clause
		
		List<Product> lstProd = dao.getProductsInBetween("P235", "P240");
		for(Product p : lstProd){
			System.out.println(p);
		}
	}

}

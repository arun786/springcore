package com.arun.main;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.bean.Product;
import com.arun.dao.ProductDAO;
import com.arun.dao.ProductDAOImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		ProductDAO dao = ctx.getBean("dao",ProductDAOImpl.class);
		Product prod = new Product();
		prod.setId("P285");
		prod.setName("Wipes");
		prod.setDescription("Used for Baby");
		prod.setPrice(new BigDecimal("45"));
		dao.create(prod);
		System.out.println("Insertion successful");
	}

}

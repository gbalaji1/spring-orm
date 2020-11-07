package com.balaji.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.balaji.dao.ProductDAO;
import com.balaji.model.Product;

public class ProductDAOTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Product product = new Product();
		product.setPname("Test");
		product.setPid(1);
		product.setPcost(23000.0);
		
		ProductDAO productDAO = (ProductDAO) applicationContext.getBean("productDAO");
		productDAO.add(product);
		System.out.println(productDAO.findAllPnames());
		
	}

}

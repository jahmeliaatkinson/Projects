package com.tcs.ecommerce;

import java.util.Optional;

import com.tcs.ecommerce.DAO.ProductDAO;
import com.tcs.ecommerce.DAO.ProductDAOImpl;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;
import com.tcs.ecommerce.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		

		Product product = new Product(1, "laptop", "i5 1oth gen", 123.0f, "laptop");
		
		ProductService productService = new ProductServiceImpl();
		
		String result = productService.createProduct(product);
		
		
		if("success".equals(result)) {
			System.out.println("recored added successfully");
		}
		else {
			System.out.println("problem");
		}
		
		Optional<Product> optional= productService.getProductById(1);
		
		if(optional.isPresent()) {
			Product product2 = optional.get();
			System.out.println(product2);
		}
		else {
			System.out.println("product is not available");
		}
		
		
		
		
		
	}
	

	/**
	Product product = new Product();
	ProductDAO dao = ProductDAOImpl.getInstance();
	ProductDAO dao2 = ProductDAOImpl.getInstance();
	
	System.out.println(dao.hashCode());
	System.out.println(dao2.hashCode());
	System.out.println(dao.equals(dao2));
	**/
	
	
}

package com.tcs.ecommerce;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;

public class MainSpring {

	
	public static void main(String[] args) {
		
		System.out.println("Before object creation ");
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	System.out.println("After object creation ");
	ProductService productService = context.getBean(ProductService.class);
	ProductService productService2= context.getBean(ProductService.class);
	Product product = new Product(5, "laptop", "15 10th gen" , 123.0f, "laptop");
	String result = productService.createProduct(product);

	System.out.println(productService.equals(productService2));
	System.out.println(productService2 == productService2);
	
	
	context.close();
	
}

}
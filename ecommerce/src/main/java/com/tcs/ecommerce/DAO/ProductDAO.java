package com.tcs.ecommerce.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.ecommerce.model.Product;

public interface ProductDAO {

	public String createProduct(Product product);
	public Optional<Product> getProductById(int id);
	public Optional<List<Product>> getProducts();
	public String removeProduct(int id);
	public Optional<Product> updateProdcut(int id, Product product);
}



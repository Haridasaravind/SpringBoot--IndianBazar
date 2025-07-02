package com.IndianBazar.service;

import com.IndianBazar.model.Product;
import java.util.List;

	public interface ProductService 
	{
	    List<Product> getAllProducts();
	    
	    List<Product> getProductsByCategory(String category);
	    
	    Product saveProduct(Product product);
	    
	    void saveAll(List<Product> products);
	    
	}

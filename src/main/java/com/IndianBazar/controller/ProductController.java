package com.IndianBazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IndianBazar.model.Product;
import com.IndianBazar.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins ="*")
public class ProductController 
	{
	
	    @Autowired
	    private ProductService productService;
	
	    @GetMapping("/category/{category}")
	    public List<Product> getByCategory(@PathVariable String category) 
	    {
	        return productService.getProductsByCategory(category);
	    }
	    
	    @GetMapping("/api/products/category/{categoryName}")
	    public List<Product> getProductsByCategory(@PathVariable String categoryName) 
	    {
	        return productService.getProductsByCategory(categoryName);
	    }
	    
	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productService.saveProduct(product);
	    }

	    
	}


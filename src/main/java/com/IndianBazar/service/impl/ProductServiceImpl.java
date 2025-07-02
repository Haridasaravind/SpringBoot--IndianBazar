package com.IndianBazar.service.impl;

import com.IndianBazar.model.Product;
import com.IndianBazar.repository.ProductRepository;
import com.IndianBazar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() 
    {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) 
    {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product saveProduct(Product product) 
    {
        return productRepository.save(product);
    }

	@Override
	public void saveAll(List<Product> products) {
		 productRepository.saveAll(products);
	}
}

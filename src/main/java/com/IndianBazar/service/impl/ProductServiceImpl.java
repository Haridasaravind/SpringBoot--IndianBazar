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

	
	public Product updateProduct(Long id, Product updatedProduct)
	{
		Product existingProduct = productRepository.findById(id)
		        .orElseThrow(() -> new RuntimeException("Product not found"));
		// Update fields
	    existingProduct.setName(updatedProduct.getName());
	    existingProduct.setDescription(updatedProduct.getDescription());
	    existingProduct.setPrice(updatedProduct.getPrice());
	    existingProduct.setQuantity(updatedProduct.getQuantity());
	    existingProduct.setCategory(updatedProduct.getCategory());
	    existingProduct.setImageUrl(updatedProduct.getImageUrl());
	    existingProduct.setIsFeatured(updatedProduct.getIsFeatured());

	    return productRepository.save(existingProduct);
	}

	public void deleteProduct(Long id) 
	{
	  Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product with ID " + id + " not found"));
	  productRepository.delete(product);
	}

	
}

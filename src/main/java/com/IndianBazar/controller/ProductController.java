package com.IndianBazar.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	    @GetMapping("/api/products/category/{categoryName}")
	    public List<Product> getProductsByCategory(@PathVariable String categoryName) 
	    {
	        return productService.getProductsByCategory(categoryName);
	    }
	    
	    @PostMapping
	    public Product createProduct(@RequestBody Product product) 
	    {
	        return productService.saveProduct(product);
	    }
	    
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) 
	    {
	        Product updated = productService.updateProduct(id, updatedProduct);
	        return ResponseEntity.ok(updated);
	    }
	    

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteProduct(@PathVariable Long id) 
	    {
	        productService.deleteProduct(id);
	        return ResponseEntity.ok("Product deleted successfully.");
	    }    
	}


















//			@GetMapping("/category/{category}")
//			public List<Product> getByCategory(@PathVariable String category) 
//			{
//			    return productService.getProductsByCategory(category);
//			}


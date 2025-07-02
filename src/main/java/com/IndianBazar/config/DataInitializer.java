/*
package com.IndianBazar.config;

import com.IndianBazar.model.Product;
import com.IndianBazar.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductService productService;

    public DataInitializer(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) {
        List<Product> electronics = List.of(
            new Product(null, "Smart TV", "4K Ultra HD TV", "https://via.placeholder.com/150", 999.0, "Electronics"),
            new Product(null, "Bluetooth Speaker", "Portable speaker", "https://via.placeholder.com/150", 49.0, "Electronics")
            // Add more if needed
        );

        List<Product> fashion = List.of(
            new Product(null, "T-Shirt", "100% Cotton", "https://via.placeholder.com/150", 19.99, "Fashion"),
            new Product(null, "Jeans", "Slim fit denim", "https://via.placeholder.com/150", 39.99, "Fashion")
        );

        List<Product> grocery = List.of(
            new Product(null, "Basmati Rice", "5kg pack", "https://via.placeholder.com/150", 12.99, "Grocery"),
            new Product(null, "Olive Oil", "1L bottle", "https://via.placeholder.com/150", 8.99, "Grocery")
        );

        List<Product> home = List.of(
            new Product(null, "Wall Clock", "Vintage design", "https://via.placeholder.com/150", 25.00, "Home & Kitchen"),
            new Product(null, "LED Lamp", "Desk lamp with dimmer", "https://via.placeholder.com/150", 15.50, "Home & Kitchen")
        );

        List<Product> books = List.of(
            new Product(null, "Java Basics", "Programming guide", "https://via.placeholder.com/150", 29.99, "Books"),
            new Product(null, "Spring Boot In Action", "Spring Boot guide", "https://via.placeholder.com/150", 34.99, "Books")
        );

        List<Product> toys = List.of(
            new Product(null, "Building Blocks", "Educational toy", "https://via.placeholder.com/150", 14.99, "Toys"),
            new Product(null, "RC Car", "Remote control car", "https://via.placeholder.com/150", 45.99, "Toys")
        );

        productService.saveAll(electronics);
        productService.saveAll(fashion);
        productService.saveAll(grocery);
        productService.saveAll(home);
        productService.saveAll(books);
        productService.saveAll(toys);
    }
        // Repeat for Fashion, Grocery, etc.
    }
*/
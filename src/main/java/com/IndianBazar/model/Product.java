package com.IndianBazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {

   	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "Product Name is mandatory")
	    private String name;

	    @NotBlank(message = "Product Description is mandatory")
	    private String description;

	    @NotNull(message = "Product Price is mandatory")
	    @DecimalMin(value = "0.01", message = "Price must be greater than Zero")
	    private Double price;

	    @NotNull(message = "Product Quantity is mandatory")
	    @Min(value = 1, message = "Quantity must be at least 1")
	    private Integer quantity;

	    @NotBlank(message = "Category is mandatory")
	    private String category;

	    @NotBlank(message = "Image URL is mandatory")
	    private String imageUrl;

	    @NotNull(message = "Featured flag is mandatory")
	    private Boolean isFeatured;
    
  
    
    
 // ✅ Default constructor (MANDATORY for JPA)
    public Product() {
    }

    // ✅ Full-args constructor (Optional but helpful)
    public Product(Long id, String name, String description, Double price, Integer quantity,
                   String category, String imageUrl, Boolean isFeatured) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.imageUrl = imageUrl;
        this.isFeatured = isFeatured;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
    
    // ✅ Getters and Setters (You can generate using IDE)
    
    
    
    
}

package com.IndianBazar.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates default constructor
@AllArgsConstructor     // Generates full-args constructor
public class Product 
{
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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Boolean getIsFeatured() {
			return isFeatured;
		}

		public void setIsFeatured(Boolean isFeatured) {
			this.isFeatured = isFeatured;
		}

		@Override
		public String toString() {
			return "Product []";
		}

		public Product() {
			super();
		}
	    
	    
	    
	    
	    
	    
}




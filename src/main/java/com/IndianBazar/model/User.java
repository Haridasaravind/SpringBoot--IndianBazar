package com.IndianBazar.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users") // Avoid using 'user' as it's a reserved keyword in some DBs
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates default constructor
@AllArgsConstructor     // Generates full-args constructor

public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank
    @Size(min=2, message ="First name must be at least 2 characters")
    private String firstName;
    
    @Column(unique = true)
    @NotBlank(message ="Last name should not be blank")
    private String lastName;

    @Column(unique = true)
    @NotBlank(message ="Email should not be blank")
    @Email(message ="Invalid email format")
    private String email;
    
    @Column(unique = true)
    @Size(min =10, message = "Phone number must be 10 digits")
    private String phonenumber;
    
    @NotBlank
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
    
    
  //********************************************************************************************//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//********************************************************************************************//

	public User() {
		super();
	}
	
	//********************************************************************************************//
	
}

package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE Users (
  id INT NOT NULL,    
  firstname VARCHAR(100) NOT NULL,   
  lastname VARCHAR(100) NOT NULL, 
  dateOfBirth VARCHAR(50) NOT NULL,
  email VARCHAR(200) NOT NULL,
  phone VARCHAR(200) NOT NULL,
  address VARCHAR(255) NOT NULL,  
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "Users")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   
   @Column(name = "firstName")
   private String firstName;

   @Column(name = "lastName")
   private String lastName;
   
   @Column(name = "dateOfBirth")
   private String dateOfBirth;

   @Column(name = "email")
   private String email;

   @Column(name = "phone")
   private String phone;

   @Column(name = "address")
   private String address;

   public User() {
   }

   public User(Integer id, String firstName, String lastName, String dateOfBirth, 
			   String email, String phone, String address)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.dateOfBirth = dateOfBirth;
	   this.email = email;
	   this.phone = phone;
	   this.address = address;
   }

   public User(String firstName, String lastName, String dateOfBirth, 
		   String email, String phone, String address)
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.email = email;
	   this.phone = phone;
	   this.address = address;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getFirstName()
   {
	   return firstName;
   }
   
   public void setFirstName(String firstName)
   {
	   this.firstName = firstName;
   }

   public String getLastName()
   {
	   return lastName;
   }
   
   public void setLastName(String lastName)
   {
	   this.lastName = lastName;
   }
   
   
   public String getDateOfBirth()
	   {
		   return dateOfBirth;
	   }

	   public void setDateOfBirth(String dateOfBirth)
	   {
		   this.dateOfBirth = dateOfBirth;
	   }

	   public String getEmail() {

		   return email;
	   }

	   public void setEmail(String email) {

		   this.email = email;
	   }

	   public String getPhone() {
		   return phone;
	   }

	   public void setPhone(String phone) {

		   this.phone = phone;
	   }

	   public String getAddress()
	   {
		   return address;
	   }

	   public void setAddress(String address)
	   {
		   this.address = address;
	   }
   
   @Override
   public String toString() {
      return "User: " + this.id + ", " + this.firstName + " " + this.lastName
    		  + ", " + this.dateOfBirth + ", " + this.email + ", " + this.phone
	    		  + ", " + this.address;
   }
}
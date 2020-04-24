package datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Random;
import java.util.UUID;

	/**
	 * @since J2SE-1.8
	 CREATE TABLE Appointments (
	  firstname VARCHAR(100) NOT NULL,   
	  lastname VARCHAR(100) NOT NULL,
	  dateOfBirth VARCHAR(50) NOT NULL,
	  email VARCHAR(200) NOT NULL,
	  phone VARCHAR(200) NOT NULL,
	  address VARCHAR(255) NOT NULL,   
	  userid VARCHAR(10) NOT NULL,
	  PRIMARY KEY (id));
	 */
	@Entity
	@Table(name = "Users")
	public class User {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   //@Column(name = "id")
	   //private Integer id;
	   
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
	   
	   @Column(name = "userid")
	   private String userid;

	   public User() {
	   }

	   /*public User(String firstName, String lastName, String dateOfBirth, 
			   String email, String phone, String address, String userid)
	   {
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.dateOfBirth = dateOfBirth;
		   this.email = email;
		   this.phone = phone;
		   this.address = address;
		   this.userid = userid;
		   
		   
		   
	   }*/

	   public User(String firstName, String lastName, String dateOfBirth, 
			   String email, String phone, String address, String userid)
	   {
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.dateOfBirth = dateOfBirth;
		   this.email = email;
		   this.phone = phone;
		   this.address = address;
		   this.userid = userid;

	   }

	  /* public Integer getId() {
	      return id;
	   }

	   public void setId(Integer id) {
	      this.id = id;
	   }*/

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
	   
	   public void setUserid(String userid)
	   {
		   
		   this.userid = userid;
	   }
	   
	   public String getUserid()
	   {
		   return userid;
	   }
	   
	   

	   @Override
	   public String toString() {
	      return "User: " + this.firstName + " " + this.lastName 
	    		  + ", " + this.dateOfBirth + ", " + this.email + ", " + this.phone
	    		  + ", " + this.address + ", " + this.userid;
	   }
}

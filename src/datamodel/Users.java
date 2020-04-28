package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 create table if not exists Users
(
	id int auto_increment
		primary key,
	firstName varchar(255) null,
	lastName varchar(255) null,
	address varchar(255) null,
	dateOfBirth varchar(255) null,
	email varchar(255) null,
	phone varchar(255) null,
	password varchar(255) null
);
 */
@Entity
@Table(name = "Users")
public class Users {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   
   @Column(name = "firstName")
   private String firstName;

   @Column(name = "lastName")
   private String lastName;

   @Column(name = "address")
   private String address;
   
   @Column(name = "dateOfBirth")
   private String dateOfBirth;
   
   @Column(name = "email")
   private String email;
   
   @Column(name = "phone")
   private String phone;
   
   @Column(name = "password")
   private String password;
   
   public Users() {
   }

   public Users(Integer id, String firstName, String lastName, String address, String dob, String email, String phone, String password)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.address = address;
	   this.dateOfBirth = dob;
	   this.email = email;
	   this.phone = phone;
	   this.password = password;
   }
   
   public Users(Integer id, String firstName, String lastName, String address, String dob, String email, String phone)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.address = address;
	   this.dateOfBirth = dob;
	   this.email = email;
	   this.phone = phone;
   }
   
   public Users(String firstName, String lastName, String dateOfBirth, 
		   String email, String phone, String address)
   {
	   
   }
   
   public Users(Integer id, String firstName, String lastName)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
   }

   public Users(String firstName, String lastName)
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
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
   
   public String getAddress()
   {
	   return address;
   }
   
   public void setAddress(String address)
   {
	   this.address = address;
   }
   
   public String getDateOfBirth()
   {
	   return dateOfBirth;
   }
   
   public void setDateOfBirth(String dateOfBirth)
   {
	   this.dateOfBirth = dateOfBirth;
   }
   
   public String getEmail()
   {
	   return email;
   }
   
   public void setEmail(String email)
   {
	   this.email = email;
   }
   
   public String getPhone()
   {
	   return phone;
   }
   
   public void setPhone(String phone)
   {
	   this.phone = phone;
   }
   
   public String getPassword()
   {
	   return password;
   }
   
   public void setPassword(String password)
   {
	   this.password = password;
   }
   
   @Override
   public String toString() {
      return "User: " + this.id + ", " + this.firstName + ", " + this.lastName + ", " + this.address + ", " + this.dateOfBirth + ", " + this.email + ", " + this.phone + ", " + this.password;
   }
}
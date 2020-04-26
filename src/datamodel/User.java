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
  id INT NOT NULL AUTO_INCREMENT,    
  firstname VARCHAR(100) NOT NULL,   
  lastname VARCHAR(100) NOT NULL,   
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

   public User() {
   }

   public User(Integer id, String firstName, String lastName)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
   }

   public User(String firstName, String lastName)
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
   
   @Override
   public String toString() {
      return "User: " + this.id + ", " + this.firstName + " " + this.lastName;
   }
}
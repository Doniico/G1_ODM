package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE Appointments (
  id INT NOT NULL AUTO_INCREMENT,    
  firstname VARCHAR(100) NOT NULL,   
  lastname VARCHAR(100) NOT NULL,
  address VARCHAR(255) NOT NULL,   
  date VARCHAR(10) NOT NULL,   
  time VARCHAR(5) NOT NULL,
  details VARCHAR(255) NOT NULL,   
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "Appointments")
public class Appointment {

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
   
   @Column(name = "date")
   private String date;
   
   @Column(name = "time")
   private String time;
   
   @Column(name = "details")
   private String details;

   public Appointment() {
   }

   public Appointment(Integer id, String firstName, String lastName, 
		   String address, String date, String time, String details)
   {
	   this.id = id;
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.address = address;
	   this.date = date;
	   this.time = time;
	   this.details = details;
   }

   public Appointment(String firstName, String lastName, String address,
		   String date, String time, String details)
   {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.address = address;
	   this.date = date;
	   this.time = time;
	   this.details = details;
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
   
   public String getDate()
   {
	   return date;
   }
   
   public void setDate(String date)
   {
	   this.date = date;
   }
   
   public String getTime()
   {
	   return time;
   }
   
   public void setTime(String time)
   {
	   this.time = time;
   }
   
   public String getDetails()
   {
	   return details;
   }
   
   public void setDetails(String details)
   {
	   this.details = details;
   }

   @Override
   public String toString() {
      return "Appointment: " + this.id + ", " + this.firstName + " " + this.lastName 
    		  + ", " + this.address + ", " + this.date + ", " + this.time
    		  + ", " + this.details;
   }
}
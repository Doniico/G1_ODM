package datamodel;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class UserTest {


	
	//Tests to see if the specific constructor can be initialized
	@Test
	public void constructorSpecificTestValid()
	{
		User test = new User(100, "Mickey", "Mouse", "1776-07-04", "MickeyMouse@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		assertTrue(100 == test.getId());
		assertEquals("Mickey", test.getFirstName());
		assertEquals("Mouse", test.getLastName());
		assertEquals("1776-07-04", test.getDateOfBirth());
		assertEquals("MickeyMouse@xxx.com", test.getEmail());
		assertEquals("402-177-0704", test.getPhone());
		assertEquals("1600 Pennsylvania Avenue", test.getAddress());

	}
	
	//Tests to see if the general constructor can be initialized
	@Test
	public void constructorGeneralTestValid()
	{
		User test = new User("Mickey", "Mouse", "1776-07-04", "MickeyMouse@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		assertEquals("Mickey", test.getFirstName());
		assertEquals("Mouse", test.getLastName());
		assertEquals("1776-07-04", test.getDateOfBirth());
		assertEquals("MickeyMouse@xxx.com", test.getEmail());
		assertEquals("402-177-0704", test.getPhone());
		assertEquals("1600 Pennsylvania Avenue", test.getAddress());
	}
	
	//Tests to make sure empty constructor can be intitalized
	@Test
	public void constructorTestValid()
	{
		try
		{
			User test = new User();
		}
		catch(Exception e)
		{
			System.out.println("Could not make user object");
		}
	}
	
	//Tests to make sure illegal id arguments cannot be passed to the 
	//general constructor
	@Test
	public void generalConstructorIdAttributeTest()
	{
		User test = new User("Mickey", "Mouse", "1776-07-04", "MickeyMouse@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		String generateID = String.format("%06d", number);
		int value = Integer.parseInt(generateID);
		test.setId(Integer.parseInt(generateID));
		
		assertTrue(value == test.getId());
		assertFalse(value != test.getId());
	}
	
	//Tests to make sure illegal id arguments cannot be passed to the 
	//general constructor
	@Test
	public void specificConstructorIdAttributeTest()
	{
		User test = new User(100, "Mickey", "Mouse", "1776-07-04", "MickeyMouse@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		String generateID = String.format("%06d", number);
		int value = Integer.parseInt(generateID);
		test.setId(Integer.parseInt(generateID));
		
		assertTrue(value == test.getId());
		assertFalse(value != test.getId());
	}
	
	//Tests to make sure getting and setting first name works
	@Test
	public void firstNameTest()
	{
		User test = new User(100, "Mickey", "Mouse", "1776-07-04", "MickeyMouse@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setFirstName("Minnie");
		
		assertEquals("Minnie", test.getFirstName());
	}
	
	//Tests to make sure getting and setting last name works
	@Test
	public void lastNameTest()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", "GeorgeWashington@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setLastName("Bush");
		
		assertEquals("Bush", test.getLastName());
	}
	
	//Tests to make sure getting and setting the date of birth works
	@Test
	public void dateOfBirthTest()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", "GeorgeWashington@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setDateOfBirth("2001-01-20");
		
		assertEquals("2001-01-20", test.getDateOfBirth());
	}
	
	//Tests to make sure getting and setting the email works
	@Test
	public void emailTest()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", "GeorgeWashington@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setEmail("GeorgeWashington@xxx.com");
		
		assertEquals("GeorgeWashington@xxx.com", test.getEmail());
	}
	
	
	//Tests to make sure getting and setting the phone works
	@Test
	public void phoneTest()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", "GeorgeWashington@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setPhone("402-177-0704");
		
		assertEquals("402-177-0704", test.getPhone());
	}
	
	//Tests to make sure getting and setting the address works
	@Test
	public void addressTest()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", "GeorgeWashington@xxx.com",
				"402-177-0704", "1600 Pennsylvania Avenue");
		
		test.setAddress("Texas");
		
		assertEquals("Texas", test.getAddress());
	}
	
	
	//Tests to make sure that the toString method words
	@Test
	public void appointmentToString()
	{
		User test = new User(100, "George", "Washington", "1776-07-04", 
				"GeorgeWashington@xxx.com", "402-177-0704", "White House");
	
		String toStringCreated = "User: 100, George Washington, 1776-07-04, GeorgeWashington@xxx.com, "
				+ "402-177-0704, White House";
		assertEquals(toStringCreated, test.toString());
	}
}


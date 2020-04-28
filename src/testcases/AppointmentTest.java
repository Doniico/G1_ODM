package testcases;

import datamodel.Appointment;
import static org.junit.Assert.*;

import org.junit.Test;

public class AppointmentTest
{
	//Tests to see if the specific constructor can be initialized
	@Test
	public void constructorSpecificTestValid()
	{
		Appointment test = new Appointment(100, "Mickey", "Mouse",
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		assertTrue(100 == test.getId());
		assertEquals("Mickey", test.getFirstName());
		assertEquals("Mouse", test.getLastName());
		assertEquals("1600 Pennsylvania Avenue", test.getAddress());
		assertEquals("1776-07-04", test.getDate());
		assertEquals("12:00", test.getTime());
		assertEquals("Independence Day", test.getDetails());
	}
	
	//Tests to see if the general constructor can be initialized
	@Test
	public void constructorGeneralTestValid()
	{
		Appointment test = new Appointment("Mickey", "Mouse", "1600 Pennsylvania Avenue",
			 "1776-07-04", "12:00", "Independence Day");
		
		assertEquals("Mickey", test.getFirstName());
		assertEquals("Mouse", test.getLastName());
		assertEquals("1600 Pennsylvania Avenue", test.getAddress());
		assertEquals("1776-07-04", test.getDate());
		assertEquals("12:00", test.getTime());
		assertEquals("Independence Day", test.getDetails());
	}
	
	//Tests to make sure empty constructor can be intitalized
	@Test
	public void constructorTestValid()
	{
		try
		{
			Appointment test = new Appointment();
		}
		catch(Exception e)
		{
			System.out.println("Could not make appointment object");
		}
	}
	
	//Tests to make sure illegal id arguments cannot be passed to the 
	//general constructor
	@Test
	public void generalConstructorIdAttributeTest()
	{
		Appointment test = new Appointment("Mickey", "Mouse", "1600 Pennsylvania Avenue",
			 "1776-07-04", "12:00", "Independence Day");
		
		test.setId(100);
		
		assertTrue(100 == test.getId());
		assertFalse(100 != test.getId());
	}
	
	//Tests to make sure illegal id arguments cannot be passed to the 
	//general constructor
	@Test
	public void specificConstructorIdAttributeTest()
	{
		Appointment test = new Appointment(100, "Mickey", "Mouse", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setId(500);
		
		assertTrue(500 == test.getId());
		assertFalse(500 != test.getId());
	}
	
	//Tests to make sure getting and setting first name works
	@Test
	public void firstNameTest()
	{
		Appointment test = new Appointment(100, "Mickey", "Mouse", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setFirstName("Minnie");
		
		assertEquals("Minnie", test.getFirstName());
	}
	
	//Tests to make sure getting and setting last name works
	@Test
	public void lastNameTest()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setLastName("Bush");
		
		assertEquals("Bush", test.getLastName());
	}
	
	//Tests to make sure getting and setting the address works
	@Test
	public void addressTest()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setAddress("Texas");
		
		assertEquals("Texas", test.getAddress());
	}
	
	//Tests to make sure getting and setting the date works
	@Test
	public void dateTest()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setDate("2001-01-20");
		
		assertEquals("2001-01-20", test.getDate());
	}
	
	//Tests to make sure getting and setting the time works
	@Test
	public void timeTest()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		test.setTime("12:01");
		
		assertEquals("12:01", test.getTime());
	}
	
	//Tests to make sure getting and setting the details works
	@Test
	public void detailsTest()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"1600 Pennsylvania Avenue", "1776-07-04", "12:00", "Independence Day");
		
		String details = "American Revolutionary War Ended";
		test.setDetails(details);
		
		assertEquals(details, test.getDetails());
	}
	
	//Tests to make sure that the toString method words
	@Test
	public void appointmentToString()
	{
		Appointment test = new Appointment(100, "George", "Washington", 
			"White House", "1776-07-04", "12:00", "Independence Day");
	
		String toStringCreated = "User: 100, George Washington, White House, 1776-07-04, 12:00, Independence Day";
		//System.out.println(test.toString());
		assertEquals(toStringCreated, test.toString());
	}
}
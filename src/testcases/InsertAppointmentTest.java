package testcases;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsertAppointmentTest {

	private WebDriver driver;
	
	@Before
	public void setUp() 
	{
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();

		//Navigate to desired web page
		driver.get("http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleInsertHB.html");
	}
	
	@Test
	public void checkTitle()
	{
		//verify title of index page
		assertEquals("Insert Data", driver.getTitle());
	}
	
	@Test
	public void checkValidURL()
	{
		String expected = "http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleInsertHB.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkEnterApptId()
	{
		try
		{
			String inputFieldID = "apptID";
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("id")));
			searchElement.sendKeys("123124");
			
			String nextPageTitle = driver.getTitle();
			System.out.println(nextPageTitle);
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter appointment id number");
		}
	}
	
	@Test
	public void checkEnterFirstName()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName")));
			searchElement.sendKeys("George");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter first name");
		}
	}
	
	@Test
	public void checkEnterLastName()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("lastName")));
			searchElement.sendKeys("Washington");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter last name");
		}
	}
	
	@Test
	public void checkEnterAddress()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("address")));
			searchElement.sendKeys("1600 Pennsylvania Avenue");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter address");
		}
	}
	
	@Test
	public void checkEnterDate()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("date")));
			searchElement.sendKeys("1776-07-04");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter date");
		}
	}
	
	@Test
	public void checkEnterTime()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("time")));
			searchElement.sendKeys("12:01");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter time");
		}
	}
	
	@Test
	public void checkEnterDetails()
	{
		try
		{
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("details")));
			searchElement.sendKeys("Independence Day");
			
			String nextPageTitle = driver.getTitle();
		}
		catch(Exception e)
		{
			System.out.println("Cannot enter appointment details");
		}
	}
	
}
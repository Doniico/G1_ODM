import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class InsertUserTest {

	private WebDriver driver;
	
	@Before
	public void setUp() 
	{
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();

		//Navigate to desired web page
		driver.get("http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleInsertUser.html");
	}
	
	@Test
	public void enterIdSearch()
	{
		//verify title of index page
		assertEquals("Insert User Data", driver.getTitle());
	}
	
	@Test
	public void checkValidURL()
	{
		String expected = "http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleInsertUser.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
	}
	
}
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

public class SearchAppointmentTest {

	private WebDriver driver;
	
	@Before
	public void setUp() 
	{
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();

		//Navigate to desired web page
		driver.get("http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleSearchHB.html");
	}
	
	@Test
	public void checkTitle()
	{
		//verify title of index page
		//System.out.println(driver.getTitle());
		assertEquals("Search Data", driver.getTitle());
	}
	
	@Test
	public void checkValidURL()
	{
		String expected = "http://ec2-54-152-177-95.compute-1.amazonaws.com:8080/teamproject/simpleSearchHB.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
	}

	
	@Test
	public void checkEnterDataWorking()
	{
		try
		{
			String inputFieldID = "fancySearch";
			String searchButton = "searchButton";
			WebDriverWait wait  = new WebDriverWait(driver, 20);
			WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(inputFieldID)));
			searchElement.sendKeys("123124");
			
			//WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(searchButton)));
			//searchButtonElement.click();
			
			String nextPageTitle = driver.getTitle();
			//System.out.println(nextPageTitle);
		}
		catch(Exception e)
		{
			System.out.println("Enter data not working");
		}
		
	}
	
	/*@Test
	public void searchData()
	{
		String inputFieldID = "fancySearch";
		String searchButton = "search";
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		//WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(inputFieldID)));
		//searchElement.sendKeys("123124");

		WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(searchButton)));
		searchButtonElement.click();
		
		String nextPageTitle = driver.getTitle();
		//System.out.println(nextPageTitle);
	}*/
	
}
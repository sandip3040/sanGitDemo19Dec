// Editing for New Folder 

package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePageObjects {

	
	WebDriver driver;
	
	
	public AmazonHomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By loginLink = By.xpath("//a[@id='nav-link-accountList']");
	
	public WebElement HomeLoginLinkReturnMethod()
	{
		return driver.findElement(loginLink);
	}
	
	
	
	
	
	
	
}

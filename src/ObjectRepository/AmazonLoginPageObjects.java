// This is edited on GITHUB and now ready for user Y1 to work for.

package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPageObjects {

	WebDriver driver;
	
	public AmazonLoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// By's Objects present on Login Page
	
	By mobileNumber = By.xpath("//input[@id='ap_email']");
	By ContinueBottun = By.xpath("//input[@id='continue']");
	By Password = By.xpath("//input[@id='ap_password']");
	By LoginButton = By.xpath("//input[@id='signInSubmit']");
	
	
	public WebElement MobileNumberReturnMethod()
	{
		return driver.findElement(mobileNumber);
	}
	
	
	public WebElement ContinueBottunReturnMethod()
	{
		return driver.findElement(ContinueBottun);
	}
	
	public WebElement PasswordReturnMethod()
	{
		return driver.findElement(Password);
	}
	
	public WebElement LoginButtonReturnMethod()
	{
		return driver.findElement(LoginButton);
	}
	
	
}

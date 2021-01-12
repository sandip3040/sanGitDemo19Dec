package TestcaseRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.AmazonHomePageObjects;
import ObjectRepository.AmazonLoginPageObjects;

public class AmazonLoginTestCase {

	
	@Test
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SAN\\SanSoftwares\\Chrome_BrowserDriver\\Chrome_87\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		
		AmazonHomePageObjects HPObject = new AmazonHomePageObjects(driver);
		HPObject.HomeLoginLinkReturnMethod().click();
		
		
		AmazonLoginPageObjects LPObject = new AmazonLoginPageObjects(driver);
		
		LPObject.MobileNumberReturnMethod().sendKeys("9890983639"); 
		LPObject.ContinueBottunReturnMethod().click();
		
		LPObject.PasswordReturnMethod().sendKeys("abcd@1234");
		LPObject.LoginButtonReturnMethod().click();
		
		
	}
	
}

	
	
	
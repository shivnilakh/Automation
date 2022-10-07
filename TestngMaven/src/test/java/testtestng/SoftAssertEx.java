package testtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maintestng.LogIn;

public class SoftAssertEx {

	
	WebDriver driver;
	LogIn login;
	String url;
	String title;
	SoftAssert soft;
	
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("Before Class");
		
		System.setProperty("webdriver.chrome.driver","D:\\Prasad\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void openHomePage() throws InterruptedException
	{
		System.out.println("Before Method");
		
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		
		login= new LogIn(driver);
		login.logInPolicyBazar();
		Thread.sleep(2000);	
		url=driver.getCurrentUrl();
		title=driver.getTitle();
		soft=new SoftAssert();
	}
	
	@Test(priority=1)
	public void assertequals()
	{
		
		soft.assertEquals(url,"https://www.policybazaar.com/" );
		System.out.println("After Assert");
	}
	@Test(priority=3)
	public void assertTrue()
	{
	
		boolean result=url.equals("https://www.policybazaar.com/");
		soft.assertTrue(result);
		soft.fail();
		System.out.println("After failure");
	}
	
}

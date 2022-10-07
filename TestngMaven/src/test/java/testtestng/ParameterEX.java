package testtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maintestng.LogIn;

public class ParameterEX {
	
	private WebDriver driver;
	private LogIn login;
	private SoftAssert soft;
	
	@BeforeTest
	@Parameters({"browser"})
	public void openBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Prasad\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Prasad\\Automation\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
	}
	
	@BeforeClass
	public void createPOMObject()
	{
		login= new LogIn(driver);
	}
	
	@BeforeMethod
	public void openHomePage() throws InterruptedException
	{
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		login.logInPolicyBazar();
		soft= new SoftAssert();
	}
	
	@Test
	public void verifyURL()
	{
		String url=driver.getCurrentUrl();
		
		soft.assertEquals(url,"https://www.policybazaar.com/");
		
	}

}

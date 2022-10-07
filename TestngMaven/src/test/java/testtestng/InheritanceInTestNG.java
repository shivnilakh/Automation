package testtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import setup.Base;

public class InheritanceInTestNG extends Base{
	
	private WebDriver driver;
	
	
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver= openChromeBrowser();
		}
		
		if (browserName.equals("firefox"))
		{
			driver= openFirefoxBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	

}

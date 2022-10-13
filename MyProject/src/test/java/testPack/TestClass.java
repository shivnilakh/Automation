package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import policybazar.LoginPage;
import policybazar.MaxLifePlans;
import policybazar.TermInsurance;

public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Prasad\\Automation\\chromedriver_win\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.logInPolicyBazar();
		
		MaxLifePlans maxplans=new MaxLifePlans(driver);
		maxplans.useMaxLifePlans();
		
		/*TermInsurance termInsurance =new TermInsurance(driver);
		termInsurance.termInsurancePage();*/
		
		
		
		
	}

}

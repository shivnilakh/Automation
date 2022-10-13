package policybazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermInsurance {
	
	//Declaration
	@FindBy (xpath= "//i[@class='icon-bg homeIconsBg term-life']")
	private WebElement termInsurance;
	
	@FindBy (xpath="//input[@id='nameAdd']")
	private WebElement name;
	
	@FindBy (xpath="//input[@placeholder='DD/MM/YYYY']")
	private WebElement dob;
	
	@FindBy (xpath="//input[@name='mobileNo']")
	private WebElement mobileNo;
	
	@FindBy (xpath="//button[@name='submitButton']")
	private WebElement submitButton;
	
	//Initialization
	
	public TermInsurance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Use
	
	public void termInsurancePage()
	{
		termInsurance.click();
		name.sendKeys("Ramuji Jalebiwala");
		dob.clear();
		dob.sendKeys("22/05/1996");
		mobileNo.sendKeys("9834378965");
		submitButton.click();
	}
	
	
	

}

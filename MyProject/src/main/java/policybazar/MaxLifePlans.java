package policybazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaxLifePlans {
	
	//Declaration
	@FindBy (xpath="//a[@title='Max Life Insurance']")
	private WebElement maxLifePlans;
	
	@FindBy (xpath="//input[@id='termName']")
	private WebElement name;
	
	@FindBy (xpath="//input[@id='dob']")
	private WebElement dob;
	
	@FindBy (xpath ="//input[@id='termMobile']")
	private WebElement mobileNo;
	
	@FindBy (xpath="//a[@id='btnSubmitTerm']")
	private WebElement submitButton;
	
	//Initialization
	
	public MaxLifePlans(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Use
	public void useMaxLifePlans()
	{
		maxLifePlans.click();
		name.sendKeys("Ramuji Jalebiwala");
		dob.clear();
		dob.sendKeys("22/05/1996");
		mobileNo.sendKeys("9834378965");
		submitButton.click();
		
	}
}

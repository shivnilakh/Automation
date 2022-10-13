package policybazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	
	@FindBy (xpath = "//a[text()='Sign in']")
	private WebElement signInButton;
	
	@FindBy (xpath="(//input[@ id='central-login-module-sign-mobile'])[2]")
	private WebElement userName;
	
	@FindBy (xpath= "(//a[@id='central-loggin-with-pwd'])[2]")
	private WebElement loginWithPassButton;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='login-in-with-password']")
	private WebElement logIn;
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Use
	/*public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	public void sendUserName()
	{
		userName.sendKeys("9834378965");
	}
	
	public void clickOnloginWithPassButton()
	{
		loginWithPassButton.click();
	}
	
	public void sendPassword()
	{
		password.sendKeys("DR@carys");
	}
	
	public void clickOnLogIn()
	{
		logIn.click();
	}*/
	
	//OR
	
 	public void logInPolicyBazar()
	{
		signInButton.click();
		userName.sendKeys("9834378965");
		loginWithPassButton.click();
		password.sendKeys("DR@carys");
		logIn.click();
	}    
	

}

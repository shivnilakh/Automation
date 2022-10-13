package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsClass {
	
	//pull demo
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	
	@Test(priority=1)
	public void test123()
	{
		System.out.println("Test");
	}


}

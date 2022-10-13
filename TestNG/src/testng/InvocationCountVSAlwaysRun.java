package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountVSAlwaysRun {
	
	@Test(invocationCount=3)
	public void a()
	{
		System.out.println("Test Method A");
	}
	
	@Test()
	public void b()
	{
		System.out.println("Test Method B");
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"b"}, invocationCount=1)
	public void c()
	{
		System.out.println("Test Method C");
	}
	
	@Test(alwaysRun=true, invocationCount=0)
	public void d()
	{
		System.out.println("Test Method D");
	}

}

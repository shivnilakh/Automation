package testng;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(enabled=false)
	public void a()
	{
		System.out.println("Test a");
	}
	
	@Test(timeOut=2000)
	public void b() throws InterruptedException
	{
		System.out.println("Test b");
		Thread.sleep(3000);
	}

}

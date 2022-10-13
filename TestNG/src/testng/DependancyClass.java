package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyClass {
	
	@Test
	public void startCar()
	{
		System.out.println("Car Starting...");
		Assert.fail();
	}
	
	@Test (dependsOnMethods= {"startCar"})
	public void driveCar()
	{
		System.out.println("Car Driving...");
	}
	
	@Test(dependsOnMethods= {"driveCar"} )
	public void stopCar()
	{
		System.out.println("Car Stopped..");
	}
	
	@Test(dependsOnMethods= {"stopCar"}, alwaysRun=true)
	public void parkCar()
	{
		System.out.println("Car Parked");
	}

}

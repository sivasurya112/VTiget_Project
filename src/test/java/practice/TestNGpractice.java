package practice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGpractice {
	
	@Test(priority = 1)
	public void createUser() {
		System.out.println("user created");
	}
	
	@Test(priority = 2)
	public void modifyUser() {
//	Assert.fail();
		System.out.println("user modified");
	}
	
	@Test(priority = 3,dependsOnMethods = {"createUser","modifyUser"})
	public void deleteUser() {
		System.out.println("user Deleted");
	}
	
}

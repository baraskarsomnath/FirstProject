package DataProvider;

import org.testng.annotations.Test;

public class Attributes {
	
	@Test(priority=3)
	public void Homepage() {
		System.out.println("Home page");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("login Page");
    }
	@Test(priority=1)
	public void Registration() {
		System.out.println("Registration page");
		
	}
	

}

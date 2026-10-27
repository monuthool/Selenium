package databaseTesting;

import org.openqa.selenium.By;

import DynamicCode.DynamicDatabase;

public class DycodeImplimented extends DynamicDatabase{
	
	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		HitUrl("https://www.facebook.com/");
		
		TakesScreenshot("URLSS");
		
		database("stp", "select email,password from facebook where Sr_no = 23;");
		
		TakesScreenshot("SS3");
		
		column("email",By.cssSelector("\"input[name=\\\"email\\\"]"));
		
		TakesScreenshot("emailSS");
		
		column("password", By.cssSelector("input[name=\"pass\"]"));
		
		TakesScreenshot("PassSS");
		
	}

}

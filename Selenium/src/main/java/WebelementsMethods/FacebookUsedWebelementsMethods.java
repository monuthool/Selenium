package WebelementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUsedWebelementsMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		email.sendKeys("avbg@1234");
		
		Thread.sleep(4000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		pass.click();
		pass.sendKeys("123454321");
		
		WebElement login = driver.findElement(By.cssSelector("div[aria-label=\"Log in\"]"));
		
		System.out.println("The text present on web page is as:" + login.getText());
		
		System.out.println("The text entered in email section is as: " + email.getAttribute("value"));
		
		//need to pass attribute
		
		System.out.println("The attribute of pass button is as: " + pass.getAttribute("value"));
		
		System.out.println("The attribute value of id attribute of email webElement is as: "+ email.getAttribute("id"));
		
		WebElement CNA = driver.findElement(By.cssSelector("a[aria-label=\"Create new account\"]"));
		
		System.out.println("The attribute value is as :"+CNA.getAttribute("aria-label"));
		
		System.out.println("The x coordinate of login btn is as: "+ login.getLocation().x);
		System.out.println("The y coordinate of login btn is as: "+login.getLocation().y);
		
		System.out.println("The size of login btn is as :"+login.getSize());
		
		System.out.println("The tagname of login btn is as :" + login.getTagName());
		
		System.out.println("The login btn is displayed on webpage is as: "+ login.isDisplayed());
		
		System.out.println("The login btn is enabled on webpage is as: "+login.isEnabled());
		
		System.out.println("The login btn is selected or not: " +  login.isSelected());
			
		
	}

}

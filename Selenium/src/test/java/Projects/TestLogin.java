package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import JavScriExeClass.BaseClass;

public class TestLogin extends BaseClass{

	public static void main(String[] args) throws Throwable {
		
		browser("chrome");
		
		HitUrl("https://practicetestautomation.com/practice-test-login/");
		
		Actions act = new Actions(driver);
		
		WebElement Home = driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		
		act.moveToElement(Home).click().build().perform();
		
		Thread.sleep(3000);
		
		WebElement Practice = driver.findElement(By.xpath("//a[text()=\"Practice\"]"));
		
		act.moveToElement(Practice).click().build().perform();
		
		Thread.sleep(3000);

		WebElement Courses = driver.findElement(By.xpath("//a[text()=\"Courses\"]"));
		
		act.moveToElement(Courses).click().build().perform();
		
		Thread.sleep(3000);

		WebElement AI_Workshop = driver.findElement(By.xpath("//a[text()=\"AI Workshop\"]"));
		act.moveToElement(AI_Workshop).build().perform();
		
		Thread.sleep(3000);

		
		WebElement Blog= driver.findElement(By.xpath("//a[text()=\"Blog\"]"));
		act.moveToElement(Blog).click().build().perform();
		
		Thread.sleep(3000);

		
		WebElement Contact = driver.findElement(By.xpath("//li[@id=\"menu-item-18\"]"));
		act.moveToElement(Contact).click().build().perform();
		
		Thread.sleep(3000);
		
		
		
	
	}

}

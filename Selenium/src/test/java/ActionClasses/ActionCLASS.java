package ActionClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DynamicCode.Base_Class;

public class ActionCLASS extends Base_Class{

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		HitUrl("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		WebElement TD = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		
		act.moveToElement(TD).click().build().perform();
		
		act.moveToElement(TD).contextClick().build().perform();
		
		WebElement SearchAll=driver.findElement(By.xpath("class=\"nav-input nav-progressive-attribute\""));
		
		act.moveToElement(SearchAll).click().build().perform();
		
		WebElement search=driver.findElement(By.cssSelector("(//input[@value=\"toys\"])[1]"));
		act.moveToElement(search).click().sendKeys("toys").doubleClick().build().perform();
		
//		TakesScreenshot("moveToElement");
		
	}

}

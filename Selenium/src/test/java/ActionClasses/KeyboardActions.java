package ActionClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DynamicCode.Base_Class;

public class KeyboardActions extends Base_Class{

	public static void main(String[] args) {

		launch_browser("chrome");
		HitUrl("https://www.jeevansathi.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email-input\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(email).click().sendKeys("xyz").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();

		act.keyDown(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}

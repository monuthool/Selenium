package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import JavScriExeClass.BaseClass;

public class Drag_Drop extends BaseClass{

	public static void main(String[] args) {

		browser("chrome");
		HitUrl("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement Outframe = driver.findElement(By.cssSelector("div[class=\"ui-widget ui-helper-clearfix\"]"));
		
		driver.switchTo().frame(Outframe);
		
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("img[alt=\"Planning the ascent\"]"));
		
		WebElement drop = driver.findElement(By.cssSelector("div[id=\"trash\"]"));
		
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop);
		
		WebElement drag_drop = driver.findElement(By.cssSelector("img[alt=\"Planning the ascent\"]"));
		
	}

}

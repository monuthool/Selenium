package ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DynamicCode.Base_Class;

public class Slider extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		
		HitUrl("https://jqueryui.com/slider/");
		
	   WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
	   driver.switchTo().frame(frame1);
	   
	   WebElement Slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));

	   Actions act = new Actions(driver);
	   
	  act.moveToElement(Slider).clickAndHold().moveByOffset(200, 0).release().build().perform();
	  
	  //back
	  act.moveToElement(Slider).clickAndHold().moveByOffset(-100, 0).release().build().perform();
	  
	  act.clickAndHold(Slider).moveByOffset(300, 0).release().build().perform();
	  
	  act.dragAndDropBy(Slider, 500, 0).build().perform();
	  
	}

}

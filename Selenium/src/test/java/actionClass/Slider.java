package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import JavScriExeClass.BaseClass;

public class Slider extends BaseClass{

	public static void main(String[] args) {

		browser("chrome");
		HitUrl("https://jqueryui.com/slider/");
		
		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);
		
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(slider).clickAndHold().moveByOffset(400, 0).release().build().perform();
		
		act.moveToElement(slider).clickAndHold().moveByOffset(-200, 0).release().build().perform();
		
		act.moveToElement(slider).clickAndHold().moveByOffset(300, 0).release().build().perform();
		
		act.clickAndHold(slider).moveByOffset(-200, 0).release().build().perform();
		act.dragAndDropBy(slider, 100, 0).build().perform();
	}

}

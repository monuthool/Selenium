package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import JavScriExeClass.BaseClass;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) throws Throwable {

		browser("chrome");
		
		HitUrl("https://jqueryui.com/droppable/");
		
		WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		System.out.println("Themes");
		
		WebElement Support = driver.findElement(By.xpath("//a[text()=\"Support\"]"));
		System.out.println("Support");


		WebElement abc = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(abc);
		
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));

		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		act.dragAndDrop(drag, drop);
		
	}

}
package ActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DynamicCode.Base_Class;

public class DragAndDrop extends Base_Class{

	public static void main(String[] args) {

		launch_browser("chrome");
		HitUrl("https://jqueryui.com/droppable/");
	
		WebElement abc = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(abc);
		
		Actions act = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
		
		WebElement Sortable = driver.findElement(By.xpath("//a[text()=\"Sortable\"]"));
		
		Sortable.click();
		
	}

}

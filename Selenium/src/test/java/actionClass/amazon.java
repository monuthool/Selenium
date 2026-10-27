package actionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import JavScriExeClass.BaseClass;

public class amazon extends BaseClass{

	public static void main(String[] args) throws Throwable {
		
		browser("chrome");
		HitUrl("https://www.amazon.in/");
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement TD = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		act.moveToElement(TD).click().build().perform();
		
		Thread.sleep(3000);
		WebElement All = driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]"));
		act.moveToElement(All).perform();
		
		Thread.sleep(3000);
		WebElement Search = driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"));
		act.moveToElement(Search).click().sendKeys("Toys").doubleClick().build().perform();
		takeScreenshot("toys");
		
		Thread.sleep(3000);
		HitUrl("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		WebElement Fashion = driver.findElement(By.xpath("//div[text()=\"Fashion\"]"));
		act.moveToElement(Fashion).click().build().perform();
		
		Thread.sleep(3000);
		WebElement Books = driver.findElement(By.xpath("//div[text()=\"Books\"]"));
		act.moveToElement(Books).click().build().perform();
		
		Thread.sleep(3000);
		WebElement Search1 = driver.findElement(By.xpath("//input[@class=\"Vy9RSP\"]"));
		act.moveToElement(Search1).click().sendKeys("mobiles").doubleClick().build().perform();
		Screenshot("mobiles");
		

	}

}

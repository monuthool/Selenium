package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//id locator
//		driver.findElement(By.id("nav-search-submit-button"));
		
//		driver.findElement(By.id("nav-search-label-id"));
		
//		driver.findElement(By.id("nav_cs_4"));
		
		//Name
		
//		driver.findElement(By.name("twitter:description"));
//		
//		//classname
//		
//		driver.findElement(By.className("twitter:card"));
		
		//LinkText
		
//		driver.findElement(By.linkText("navLeftFooter nav-sprite-v1"));
		
		//partialLinkText
		
//		driver.findElement(By.partialLinkText("navLeftFooter"));
		
		//css tagname and idvalue
		
//		driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		
		//css selector tagname and classname
		
//		driver.findElement(By.cssSelector("div.nav-search-field "));
		
		//tagname and attribute
		
//		driver.findElement(By.className("input[id=\"nav-search-submit-button\"]"));
//		
//		//tagname and multiple attribute
//		
//		driver.findElements(By.cssSelector("input[id='twotabsearchtextbox'][name='field-keywords']"));
		
		//className
		
//		driver.findElement(By.className("class=\"layoutToolbarPadding\""));
		//tagname
		
//		driver.findElements(By.tagName("div"));
		
//driver.findElement(By.cssSelector("input[type*=\'text\']"))	;	
		//startswith =      tagname[attribute^="value"]
		
//		driver.findElement(By.cssSelector("input[type^=\"text\"]"));
		
		//endswith =    tagname[attribute$="value"]
		
//		driver.findElement(By.cssSelector("input[type$=\"text\"]"));
		
		//absolute xpath
		///html/body/div[1]/div[1]/div[2]/div[1]/div/div/section/div/div/div/div/div/ol/li/a/div/div[1]/img
		
		//relative xpath
		
//		driver.findElement(By.cssSelector("//div[@class=\"apb-default-slot apb-default-merchandised-search-2\"]"));
		
		//first-value
		
//		driver.findElement(By.xpath("//div[@class=\'apb-default-slot apb-default-merchandised-search-2\']"));
		
		//first-child
		
//		driver.findElement(By.cssSelector("img[class=\"s-image\"]:first-child"));
		
		//last-child
//		driver.findElement(By.cssSelector("img[class=\"s-image\"]:last-child"));
		
//driver.findElement(By.cssSelector("img[class=\"s-image\"]:nth-child(1)"));	
		
		// :nth-last-child(n)
		
//		driver.findElement(By.cssSelector("img[class=\"s-image\"]:nth-last-child(1)"));
		
		//Relative xpath
		
//		driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]"));
		
		//tagname multiple attribute
		
//		driver.findElement(By.xpath("//input[@type=\"text\"][@id=\"twotabsearchtextbox\"]"));
		
		//and operator
		
//		driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"twotabsearchtextbox\"]"));
		
//		driver.findElement(By.xpath("//input[contains(@type,\"text\")]"));
		
		//starts-with
		
//		driver.findElement(By.xpath("//input[starts-with(@type,\"text\")]"));
		
		driver.findElement(By.xpath("//input[text()=\"nav-search-submit-button\"]"));
		
		
		
	}

}

package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//id locator
		driver.findElement(By.id("nav-search-submit-button"));
//		driver.findElement(By.id("a-page"));
//		driver.findElement(By.id("twotabsearchtextbox"));
		
		//Name
		
		driver.findElement(By.name("crid"));
		driver.findElement(By.name("field-keywords"));
		driver.findElement(By.name("sprefix"));
		
		//Classname
		
		driver.findElement(By.className(""));
		
		//linktext
		driver.findElement(By.linkText("nav-a  "));
		
		//partiallinktext
		driver.findElement(By.partialLinkText("nav"));
		
		//css
		driver.findElement(By.cssSelector("span#nav-search-submit-text"));
		
		driver.findElement(By.cssSelector("div#nav-search-submit.nav-sprite"));
		
		driver.findElement(By.id("div[class=\"nav-search-submit nav-sprite\"]"));
		
		driver.findElement(By.cssSelector("input[id=\"nav-search-submit-button\"][ type=\"submit\"] "));


	}

}

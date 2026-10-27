package Projects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import ScreenSHots.JavaScriptExecutor;

public class Project {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		Actions act = new Actions(driver);
		WebElement Register = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		act.moveToElement(Register).click().build().perform();
		
		WebElement WebTable = driver.findElement(By.xpath("//a[text()=\"WebTable\"]"));
		act.moveToElement(WebTable).click().build().perform();
		
		

		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		js.executeScript("window.scrollTo(0,0)");
	
		js.executeScript("window.history.go(0)");
	
		js.executeScript("window.history.back()");

		js.executeScript("window.history.forward()");
	
	}

}

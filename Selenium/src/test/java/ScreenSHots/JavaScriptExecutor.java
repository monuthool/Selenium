package ScreenSHots;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import JavScriExeClass.BaseClass;

public class JavaScriptExecutor extends BaseClass{

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.railyatri.in/");
		
		JavaScriptExecutor js = (JavaScriptExecutor) driver;
		
	}

	public void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}

}

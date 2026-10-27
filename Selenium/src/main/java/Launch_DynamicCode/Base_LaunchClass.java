package Launch_DynamicCode;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_LaunchClass {
	public static WebDriver driver;
	
	public static void browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
	
	System.out.println("The browser launched is as:"+ browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
}
public static void HitUrl(String url) {
		
		driver.get(url);
		
		System.out.println("The title of webpage is as:"+driver.getTitle());
		
	}

public static void takeScreenshot(String Screenshot_name) throws Throwable {
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File target = new File("./ScreenShot/"+Screenshot_name + ".png");
	
	FileHandler.copy(source, target);
}

public static void Screenshot(String SS_name) {
	
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	
	File target1 = new File("./RailYatri/railYatriSS.png");
	

}
}

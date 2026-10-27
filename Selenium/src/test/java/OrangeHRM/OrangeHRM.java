package OrangeHRM;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Launch_DynamicCode.Base_LaunchClass;

public class OrangeHRM extends Base_LaunchClass{

	public static void main(String[] args) throws Throwable {
		
		browser("chrome");
		
		Thread.sleep(5000);

		HitUrl("https://opensource-demo.orangehrmlive.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./ScreenShot/OrangeHrmSS1.png");
		
		FileHandler.copy(source, target);
		
		Thread.sleep(5000);
		
		HitUrl("https://www.amazon.in/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		
		File target1 = new File("./ScreenShot/AmazonSS1.png");
		
		FileHandler.copy(source1, target1);

	}

}

package ScreenSHots;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import Launch_DynamicCode.Base_LaunchClass;

public class GoogleClass extends Base_LaunchClass{

	public static void main(String[] args) throws Throwable {

		browser("chrome");
		HitUrl("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShot/GoogleSS2.png");
		
		FileHandler.copy(source, target);
		
		HitUrl("https://www.shadi.com/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./ScreenShot/ShadiSS1.png");
		
		FileHandler.copy(source1, target1);
		
	}

}

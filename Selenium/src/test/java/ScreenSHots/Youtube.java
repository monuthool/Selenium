package ScreenSHots;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import DynamicCode.Base_Class;

public class Youtube extends Base_Class{

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		HitUrl("https://www.youtube.com/");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./ScreenShot/Youtube.png");
		
		FileHandler.copy(source, target);
	}

}

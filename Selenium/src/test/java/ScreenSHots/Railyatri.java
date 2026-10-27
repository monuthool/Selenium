package ScreenSHots;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import DynamicCode.Base_Class;

public class Railyatri extends Base_Class{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		HitUrl("https://www.railyatri.in/");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./Screenshot_SS1/SS1.png");
		
		FileHandler.copy(source, target);
		
	

	}

}

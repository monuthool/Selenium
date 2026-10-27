package ScreenSHots;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import DynamicCode.Base_Class;

public class Facebook extends Base_Class{

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		HitUrl("https://www.facebook.com/login/?locale=en_GB");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		ts.getScreenshotAs(OutputType.FILE);
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./ScreenShot/launch_browserss.png");
		Files.copy(source.toPath(),
				target.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}

}

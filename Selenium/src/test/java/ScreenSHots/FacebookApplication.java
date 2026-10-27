package ScreenSHots;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import DynamicCode.Base_Class;

public class FacebookApplication extends Base_Class{

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		
		String projectpath = System.getProperty("user.dir");
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File(projectpath  + "/ScreenShot/SS12.png");
		
		Files.copy(source.toPath(),
				target.toPath(),
				StandardCopyOption.REPLACE_EXISTING);
		
		HitUrl("https://www.amazon.in/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		
		File target1 = new File(projectpath + "./Screenshot/launch_browser/ss22.png");
		
		Files.copy(source1.toPath(),target1.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
	}

}

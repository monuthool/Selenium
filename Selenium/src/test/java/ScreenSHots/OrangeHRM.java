package ScreenSHots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import DynamicCode.Base_Class;

public class OrangeHRM extends Base_Class{

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		
		HitUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./ScreenShot/launch_browserSS1.png");
		
		Files.copy(
				source.toPath(),
				target.toPath(),
				StandardCopyOption.REPLACE_EXISTING
				);

		HitUrl("https://www.amazon.in/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		ts1.getScreenshotAs(OutputType.FILE);
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 =new File("./ScreenShot/hiturlss2.png");
		
		Files.copy(
				source1.toPath(),
				target1.toPath(),
				StandardCopyOption.REPLACE_EXISTING
				);

	}

}

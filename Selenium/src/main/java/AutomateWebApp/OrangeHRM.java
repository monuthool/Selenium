package AutomateWebApp;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import DynamicCode.Base_Class;

public class OrangeHRM extends Base_Class{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		Screenshot("launch_browserSS1");
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		HitUrl("https://www.railyatri.in/");
		
		TakesScreenshot("HitUrl_SS4");
		
		Screenshot("HitUrl");

		
	}

	public static void Screenshot(String SS_name) throws Throwable {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(projectpath +".||railYatriSS||Screenshot_name + .png ");
		
		Files.copy(source1.toPath(),
				target1.toPath(), StandardCopyOption.REPLACE_EXISTING);
	}

}

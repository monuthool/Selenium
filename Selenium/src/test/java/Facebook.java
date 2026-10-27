import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Launch_DynamicCode.Base_LaunchClass;

public class Facebook extends Base_LaunchClass{

	public static void main(String[] args) throws Throwable {

		browser("chrome");
		
		Thread.sleep(4000);
		
		HitUrl("https://www.facebook.com/");
//		
//		String projectpath = System.getProperty("user.dir");
//		
//		System.out.println("projectpath");
//		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./ScreenShot/fbSS1.png");
		
		FileHandler.copy(source, target);
		
		Thread.sleep(4000);
		
		HitUrl("https://www.zomato.com/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./ScreenShot/ZomatoSS1.png");
		
		FileHandler.copy(source1, target1);
		
		
		
		
	}

}

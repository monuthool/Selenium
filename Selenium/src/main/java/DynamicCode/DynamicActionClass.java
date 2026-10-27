package DynamicCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicActionClass {
	
	public static String browser;

	public static void launch_browser(String browse) {
	WebDriver driver;
if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}
	}

}

package DynamicCode;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DynamicCodeReports {
	
	   static String ScreenShot_Name;
	   static  String Projectpath;
	  static ExtentTest Et;
	  static ExtentReports Er;
	  static public WebDriver driver;

	public static void reports(String DocTitle,String ReportName, String url) {
		
		String projectpath = System.getProperty("user.dir");
		
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath  + "\\ScreenShot\\");
		
		//configuration set
		
		Esr.config().setDocumentTitle(DocTitle);
		Esr.config().setReportName(ReportName);
		Esr.config().setTheme(Theme.STANDARD);
		
		//System configuration set
		
		ExtentReports Er = new ExtentReports();
		Er.attachReporter(Esr);
		
		Er.setSystemInfo("OS", "window");
		Er.setSystemInfo("Browser", "chrome");
		Er.setSystemInfo("Domain", "Ecommerce Domain");
		Er.setSystemInfo("Appliaction", "App");
		Er.setSystemInfo("Client", "AmazonClient");
		Er.setSystemInfo("QA", "monu");

	}
	
	public static void testCases(String testname, String testinfo,String ScreenShot) {
		
		ExtentTest Et = Er.createTest(testname);
		Et.log(Status.INFO, testinfo);
		Et.addScreenCaptureFromPath(Projectpath +"\\ScreenShot\\"+ScreenShot_Name + ".png");
		
	}
	
	public static void launch_browser(String browser) {
		
	
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")){
				driver = new EdgeDriver();
	}
	System.out.println("The browser launched is as:"+ browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
}
public static void HitUrl(String Url) {
	driver.get(Url);
	System.out.println("The title of webpage is as:"+ driver.getTitle());
}

public static void takeScreenShot(String ScreenShot_name) throws Throwable {
TakesScreenshot ts =(TakesScreenshot)driver;

File source = ts.getScreenshotAs(OutputType.FILE);
File target = new File("./ScreenShot/"+ScreenShot_name+".png");
Files.copy(source.toPath(),
		target.toPath(), StandardCopyOption.REPLACE_EXISTING);
}
}

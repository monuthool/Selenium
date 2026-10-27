package reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import DynamicCode.Base_Class;

public class Reports extends Base_Class{
	
     static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) throws Throwable {
		
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\Reports\\GeneratedReport\\");

		//configuration set
		
		Esr.config().setDocumentTitle("Automation Report");
		Esr.config().setReportName("Testing Report");
		Esr.config().setTheme(Theme.STANDARD);
		
		//System configuration set
		
		ExtentReports Er = new ExtentReports();
		Er.attachReporter(Esr);
		
		//System information set
		
		Er.setSystemInfo("OS", "window");
		Er.setSystemInfo("Domain", "Ecommerce Domain");
		Er.setSystemInfo("Application", "Amazon");
		Er.setSystemInfo("Client", "AmazonClient");
		Er.setSystemInfo("QA", "Monu");
		
		//Extent Test --- it creates the test cases
		
		ExtentTest Et = Er.createTest("Hit Url");
		Et.log(Status.INFO, "Amazon Url");
	  	
		ExtentTest Et1 = Er.createTest("Hit Url");                                                                                                     
		Et1.log(Status.PASS, "Test Pass");  
		
		ExtentTest Et2 = Er.createTest("Hit Url");                                                                                                     
	  	Et2.log(Status.FAIL, "Test Failed");    
	  	
	  	ExtentTest Et3 = Er.createTest("Hit Url");                                                                                                     
	  	Et3.log(Status.SKIP, "Amazon Url");   
	  	
	  	launch_browser("chrome");
	  	HitUrl("https://www.amazon.in/");
	    Thread.sleep(3000);
	  	TakesScreenshot("ReportSS1");
	  	Et.addScreenCaptureFromPath(projectpath);
	  	Er.flush();
	}

}

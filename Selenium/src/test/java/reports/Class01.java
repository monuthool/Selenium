package reports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentReports;
import DynamicCode.DynamicCodeReports;

public class Class01 extends DynamicCodeReports{
	
	static ExtentReports Er;

	public static void main(String[] args) throws Throwable {
		
		reports("DynamicRepory", "Testing", "https://www.flipkart.com/");
		//testCases("Url Hit", "TestPass");
		
		testCases("Browserlaunched", "chrome", "chromeSS1");
		testCases("Url Hot", "TestPass", "UrlSS1");
		testCases("Search", "Search Functionality", "SearchSS2");
		testCases("Data send", "Text entered", "DataSS3");
		testCases("Clicked", "Clicked on search button", "ClickedSS");

		launch_browser("chrome");
		HitUrl("https://www.flipkart.com/");
		
		takeScreenShot("UrlSS1");
		
		WebElement search = driver.findElement(By.xpath("(//input[@class=\"nw1UBF v1zwn26\"])[1]"));
		search.click();
		search.sendKeys("Toys");
		takeScreenShot("DataSS3");
		
	

	}

}

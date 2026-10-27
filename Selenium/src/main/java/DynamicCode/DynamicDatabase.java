package DynamicCode;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDatabase {

		public static WebDriver driver;
		public static String host = "localhost";
		public static String portnumber = "3306";
		public static ResultSet result;


		public static void launch_browser(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {
				
				driver = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				
			}else if (browser.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				
			}
			System.out.println("The browser launched is as:"+ browser);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
		}
		public static void HitUrl(String url) {
			
			driver.get(url);
			
			System.out.println("The title of webpage is as:"+driver.getTitle());
			
		}
		
		public static void TakesScreenshot(String Screenshot_name) throws Throwable  {
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target  = new File("./DatabaseSS/+ Screenshot_name + .png");
			
			Files.copy(
					source.toPath(),
					target.toPath(),
					StandardCopyOption.REPLACE_EXISTING
					);
	}public static void database(String databasename, String query) throws SQLException {
		
		String host = "localhost";
		String portnumber = "3306";
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+ host+":"+portnumber+"/"+databasename, "root", "root@1234567896");
		Statement cs = connect.createStatement();
		ResultSet result = cs.executeQuery(query);
		result.next();
		
	}
	public static void column(String columnname, By locator) throws SQLException {
		System.out.println(result.getString(columnname));
		driver.findElement(locator).sendKeys(result.getNString(columnname));
	}

}

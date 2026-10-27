package WebelementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class railyatri {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://www.railyatri.in/");
		
		WebElement Login = driver.findElement(By.cssSelector("button[fdprocessedid=\"tsp99d\"]"));
		Login.click();
		
//		WebElement Login = driver.findElement(By.cssSelector("button[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium Mui-login__cta css-re7hf6\"]"));
//		Login.click();
		
		WebElement MobileNumber = driver.findElement(By.cssSelector("input[type=\"number\"]"));
		
		WebElement SendOTP = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		SendOTP.click();
		
		WebElement EnterOTP = driver.findElement(By.cssSelector("div[class=\"otp-container MuiBox-root css-0\"]"));
		
		WebElement VerifyOTP = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		VerifyOTP.click();
		
		System.out.println("The text present on web page is as:"+Login.getText());
		System.out.println("The text entered in MobileNumber section is as :"+MobileNumber.getAttribute("value"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

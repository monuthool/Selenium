package JavScriExeClass;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus extends BaseClass{

	public static void main(String[] args) throws Throwable {

		 driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://www.redbus.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,150)");
		//refresh
		Thread.sleep(3000);
		js.executeScript("window.history.go(0)");
		Screenshot("refresh");
		//bottom
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Screenshot("bottom");
		//Top
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,0)");
		Screenshot("Top");
		//back
		Thread.sleep(3000);
		js.executeScript("window.history.back()");
		Screenshot("back");
		//forward
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");
		Screenshot("forward");
		}

}

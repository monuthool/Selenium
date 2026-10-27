package JavScriExeClass;


import org.openqa.selenium.JavascriptExecutor;

public class railYatri extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		driver.get("https://www.railyatri.in/");
		
		browser("chrome");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		
		Thread.sleep(3000);
		//scroll to bottom
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		
		//refresh
		Thread.sleep(3000);

		js.executeAsyncScript("window.history.go(0)");

		
		//back
		Thread.sleep(3000);

		js.executeScript("window.history.back()");


		//forward
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");

		
		//Top
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,0)");



	}

}

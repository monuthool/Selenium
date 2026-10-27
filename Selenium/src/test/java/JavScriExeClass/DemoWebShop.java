package JavScriExeClass;

import org.openqa.selenium.JavascriptExecutor;

public class DemoWebShop extends BaseClass{

	public static void main(String[] args) throws Throwable {
		browser("chrome");
		
		HitUrl("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		js.executeScript("window.history.go(0)");
		takeScreenshot("ArrangePage");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenshot("Bottom");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,0)");
		takeScreenshot("Top");
		
		Thread.sleep(5000);
		js.executeAsyncScript("window.history.back()");
		takeScreenshot("back");
		
		Thread.sleep(5000);
		js.executeScript("window.history.go(0)");
		takeScreenshot("refresh");
		
		Thread.sleep(5000);
		js.executeScript("window.history.forward()");
		takeScreenshot("forward");
		
	}

}

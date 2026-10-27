package JavScriExeClass;

import org.openqa.selenium.JavascriptExecutor;

public class twittlogin extends BaseClass{

	public static void main(String[] args) throws Throwable {
		browser("chrome");
		HitUrl("https://x.com/twitt_login?lang=en");
		takeScreenshot("twittlogin");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)");
		takeScreenshot("adjust");
		Thread.sleep(3000);

		js.executeScript("window.history.go(0)");
		takeScreenshot("refresh");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenshot("bottom");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,0)");
		takeScreenshot("Top");
		Thread.sleep(3000);

		js.executeScript("window.history.back()");
		takeScreenshot("back");
		Thread.sleep(3000);

		js.executeScript("window.history.forward()");
		takeScreenshot("forward");
		Thread.sleep(3000);


	}

}

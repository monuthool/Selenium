package JavScriExeClass;

public class OrangeApp extends BaseClass{

	public static void main(String[] args) throws Throwable {
		browser("chrome");
		
		HitUrl("https://opensource-demo.orangehrmlive.com/");
		
		takeScreenshot("HitUrl_SS5");
	}

}

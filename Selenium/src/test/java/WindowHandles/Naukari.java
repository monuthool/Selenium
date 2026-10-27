package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import DynamicCode.Base_Class;

public class Naukari extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		HitUrl("https://www.naukri.com/");
		
		//javaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[@title=\"About us\"]")).click();
		
		Set<String> window_id = driver.getWindowHandles();
		
		Iterator<String> id = window_id.iterator();
		
		String parent_id = id.next();
		
		System.out.println("The parent id is as: " + parent_id);
		
		String child_id = id.next();
		
		System.out.println("The child id is as : " + child_id);
		
		driver.switchTo().window(child_id);
		
		driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();
		
		driver.findElement(By.xpath("//a[text()='CAREERS']")).click();
		
		String child_id1 = id.next();
		
		System.out.println("The child_id1 is as :" + child_id1);
		
		driver.switchTo().window(child_id1);
		
		driver.findElement(By.xpath("//a[text()='ABOUT']")).click();
		

	}

}

package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DynamicCode.Base_Class;

public class Dynamic_dropdown extends Base_Class{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		HitUrl("https://www.railyatri.in/");
		
		//javaScriptExecutor("window.scrollBy(0,200)");
		Thread.sleep(4000);
		
		WebElement From = driver.findElement(By.xpath("//input[@id=\"TrainFromSourceField\"]"));
		From.click();
		From.sendKeys("Nagp");
		
		WebElement frm = driver.findElement(By.xpath("//span[text()=\"NAGPUR\"]"));
		System.out.println("The size of dropdown is as : "+ frm.getSize());
		
		
	}

}

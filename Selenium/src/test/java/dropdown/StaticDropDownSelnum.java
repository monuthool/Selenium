package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DynamicCode.Base_Class;

public class StaticDropDownSelnum extends  Base_Class{

	public static void main(String[] args) {

		launch_browser("chrome");
		
		HitUrl("https://automationtesting.co.uk/dropdown.html");
		
		WebElement DropdownMenu = driver.findElement(By.xpath("//select[@name=\"cars\"]"));
		DropdownMenu.click();
		DropdownMenu.sendKeys("BMW");
		
		WebElement Data = driver.findElement(By.xpath("//select[@name=\"cars\"]//child::option"));
		System.out.println("The  size of data dropdown is as:"+Data.getSize());
		
			
		
	}

}

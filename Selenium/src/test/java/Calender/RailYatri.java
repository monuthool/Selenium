package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DynamicCode.Base_Class;

public class RailYatri extends Base_Class{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		HitUrl("https://www.railyatri.in/");
		
		//javaScriptExecutor("window.scrollBy(0,150)");
		
		Thread.sleep(3000);
		WebElement calender = driver.findElement(By.cssSelector("input[value=\"08 Sep, Tue\"]"));
		calender.click();
		
		while(true) {
			String month_year = driver.findElement(By.xpath("//div[@class=\"MuiPickersCalendarHeader-label css-1v994a0\"]")).getText();
			System.out.println("The current month_year is :" + month_year);
			
			if(month_year.equalsIgnoreCase("October")) {
				driver.findElement(By.cssSelector("button[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart MuiIconButton-sizeMedium MuiPickersArrowSwitcher-button css-1fklenr\"]")).click();
			}else {
				break;
			}
		}

		driver.findElement(By.xpath("//button[text()=\"15\"]")).click();
		System.out.println("The slected date is as :" + calender.getAttribute("value"));
	}

}

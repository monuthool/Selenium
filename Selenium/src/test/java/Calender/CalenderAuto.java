package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DynamicCode.Base_Class;

public class CalenderAuto extends Base_Class{

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		HitUrl("https://www.railyatri.in/");
		
		//javaScriptExecutor("window.scrollBy(0,150)\"");
		
		Thread.sleep(3000);
		WebElement calender = driver.findElement(By.xpath("//input[@id=\"trainDatepicker\"]"));
		calender.click();
		
		Thread.sleep(3000);

		WebElement month_year = driver.findElement(By.xpath("//div[@id=\":r2d:-grid-label\"]"));
		month_year.click();
		
		System.out.println("The current month_year is :" + month_year.getText());
		
//		WebElement date = driver.findElement(By.cssSelector("button[class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-qbcmfh\"]"));
//		date.click();
//		
//		System.out.println("The date of current month is as :" + calender.getAttribute("value"));
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("svg[data-testid=\"ArrowRightIcon\"]")).click();
	}

}

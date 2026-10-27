package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import DynamicCode.Base_Class;

public class StaticDropDowns extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		
		HitUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_EXP_IMP&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Jeevansathi_Login&utm_term=jeevansathi%20login&gad_source=1&gad_campaignid=23555450292&gbraid=0AAAAADzDvYbmoiAyzR2Mr1OY-Le57kZG8&gclid=Cj0KCQjw--7UBhCpARIsAGJBptiVPwZpc8HlHm867xVymlUU7y9D-SIR-z8cTNscHVv8TsQ3pIHH9ncaAusDEALw_wcB#");

		WebElement Email = driver.findElement(By.cssSelector("input#reg_email"));
		
		Email.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(Email).click().sendKeys("raj1984@gmail.com").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement profile = driver.findElement(By.xpath("//select[@name=\"reg[relationship]\"]"));
		
		profile.click();
		
		Select s = new Select(profile);
		
		s.selectByVisibleText("Son");
		
		WebElement Day = driver.findElement(By.xpath("(//select[@onblur=\"hide_help(this)\"])[1]"));
		Day.click();
		
		Select s1 = new Select(Day);
		s1.selectByValue("7");
		
		WebElement Month = driver.findElement(By.xpath("//select[@name=\"reg[dtofbirth][month]\"]"));
		Month.click();
		
		Select s2 = new Select(Month);
		s2.selectByIndex(11);
		
		WebElement Year = driver.findElement(By.xpath("//select[@name=\"reg[dtofbirth][year]\"]"));
		Year.click();
		
		Select s3 = new Select(Year);
		s3.selectByValue("2005");
		
		WebElement Height = driver.findElement(By.xpath("//select[@name=\"reg[height]\"]"));
		Height.click();
		
		Select s4 = new Select(Height);
		s4.selectByIndex(18);
		
		WebElement MarritalStatus = driver.findElement(By.xpath("//select[@name=\"reg[mstatus]\"]"));
		MarritalStatus.click();
		
		Select s5 = new Select(MarritalStatus);
		s5.selectByIndex(2);
		
		WebElement MotherTongue = driver.findElement(By.xpath("//select[@id=\"reg_mtongue\"]"));
		MotherTongue.click();
	}

}

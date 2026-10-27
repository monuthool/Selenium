package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import DynamicCode.Base_Class;

public class StaticDropDown extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		HitUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_EXP_IMP&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Jeevansathi_Login&utm_term=jeevansathi%20login&gad_source=1&gad_campaignid=23555450292&gbraid=0AAAAADzDvYbmoiAyzR2Mr1OY-Le57kZG8&gclid=Cj0KCQjw--7UBhCpARIsAGJBptiVPwZpc8HlHm867xVymlUU7y9D-SIR-z8cTNscHVv8TsQ3pIHH9ncaAusDEALw_wcB#");

		 WebElement email = driver.findElement(By.cssSelector("input#reg_email"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(email).click().sendKeys("xyz").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}

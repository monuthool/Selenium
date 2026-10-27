package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import DynamicCode.Base_Class;

public class Facebook extends Base_Class{

	public static void main(String[] args) throws SQLException{

		String host="localhost";
		String portnumber="3306";
		launch_browser("chrome");
		HitUrl("https://www.facebook.com/");
		
		//url:--"jdbc:mysql://host:portnumber/databasename"
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/stp", "root", "manager");
		Statement cs = connect.createStatement();
		 ResultSet result = cs.executeQuery("select email,password from facebook where sr_no=21;");
		 result.next();
//		 
		 //set --array--index 0--eclipse---sql---index 1--
		 
		 System.out.println(result.getString("email"));
		 System.out.println(result.getString("password"));
		 
		 driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("email");
		 driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("password");


		
		
		
	}

}

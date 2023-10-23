package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {

	WebDriver driver;	

	//constructor that will be automatically called as soon as the object of the class is created
	
	public loginPageObject(WebDriver x) {driver=x;}

	
		public WebElement getuserName(){
			WebElement username =
			driver.findElement(By.name("user-name"));
			return username;	

	}

		public WebElement getpassword(){
			WebElement password =
			driver.findElement(By.xpath("//*[@id=\"password\"]"));
			return password;	

		}
	
		public WebElement clickloginbutton(){
			WebElement loginbutton =
			driver.findElement(By.id("login-button"));
			return loginbutton;	
		
}
			
	public WebElement clickonbagback () {
	WebElement backpack= 
   driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button"));
   	return backpack;	
   		
	}
		
}





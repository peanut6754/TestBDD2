package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	
	
	WebDriver driver;	

	//constructor that will be automatically called as soon as the object of the class is created
	
	public HomePageObject(WebDriver b) {driver=b;}
	
	
	public WebElement finduserName(){
		WebElement fusername =
		driver.findElement(By.xpath("//*[@id=\"email\"]"));
		return fusername;	
	
		
	
}
	
	public WebElement Password(){
		WebElement pd =
		driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		return pd;		
		

}
	public WebElement clickloginbutton(){
		WebElement lognbutton =
		driver.findElement(By.name("login"));
		return lognbutton;		
		
	
}
	
	
	
	
}


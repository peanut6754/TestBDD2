package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HomePageObject;
import PageObject.loginPageObject;
import io.cucumber.java.en.*;

public class HomePage {
	
	public WebDriver driver;
	public HomePageObject ba;
	
	@Given("User is in the login home page")
	public void user_is_in_the_login_home_page() throws InterruptedException {
	    

		driver = new ChromeDriver();
		ba = new HomePageObject(driver);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		Thread.sleep(1000);
		 
	
	
	}

	@When("User is going to enter  user name")
	public void user_is_going_to_enter_user_name() {
	ba.finduserName().sendKeys("test");	
		
		
		
	}

	@When("User is going to enter user password")
	public void user_is_going_to_enter_user_password() {
	ba.Password().sendKeys("test");    
	}

	@When("User is going to click on login button")
	public void user_is_going_to_click_on_login_button() {
	ba.clickloginbutton().click();
		
	}

	@Then("User should navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
	 
		
	}
}
	
	
	
	
	
	
	
	
	
	


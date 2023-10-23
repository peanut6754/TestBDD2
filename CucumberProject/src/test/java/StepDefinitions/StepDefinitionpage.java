package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HomePageObject;
import PageObject.loginPageObject;
import io.cucumber.java.en.*;


public class StepDefinitionpage {

	
	public WebDriver driver;
	public loginPageObject ds;
	
	
	@Given("User opens URL")
	public void user_opens_url() throws InterruptedException {
		       

		driver = new ChromeDriver();
		ds = new loginPageObject(driver);
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		Thread.sleep(1000);
		 
	
	
	}
	
	@Given("User entres Email and password")
	public void user_entres_email_and_password() {
	ds.getuserName().sendKeys("standard_user");
	ds.getpassword().sendKeys("secret_sauce");
		
	}

	@Given("User click on login button")
	public void user_click_on_login_button() {
	 ds.clickloginbutton().click();
	}

	@Then("Page tile should be Products")
	public void page_tile_should_be_products() {
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
		    System.out.println("Title is correct: " + actualTitle);
		} else {
		    System.out.println("Title is incorrect. Actual title is: " + actualTitle);}
		}
		
		
		
		
		
		@When("User click on sauce labs Backpack")
		public void user_click_on_sauce_labs_backpack() {
		ds.clickonbagback().click();    
		
			
		}	
		
		

	}
	
	
	



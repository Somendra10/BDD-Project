package StepDefinitions;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.hooksClass;
import PageFactory.loginPageFactory;
import PageFactory.productPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinitions {
	
    WebDriver driver= hooksClass.driver;
    loginPageFactory login;
    productPageFactory product;
	
	
	
	
	
	
	
	@Given("User is on Login screen")
	public void user_is_on_login_screen() throws IOException  {
		
		
		login=new loginPageFactory(driver);
		login.userOnLoginScreen();
		
		
		
	
	}

	@When("User Enter invalid Email and Password")
	public void user_enter_invalid_email_and_password() {
		
		 
		   login.enterInvalidEmail();
		   login.enterInvalidPassword();
	}
		
		
		


	@And("User click on Login button")
	public void user_click_on_login_button() {
        login.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("Should show the error message")
	public void should_show_the_error_message() throws InterruptedException {
	    login.loginErrorMsg();
	    
	     
	}
	
	@When("User Enter valid {string} and {string}")
	public void user_enter_valid_email_and_password(String Email, String Password ) throws InterruptedException {
		login.enterMultipleEmailPsw(Email, Password);
		Thread.sleep(3000);
	   
	}

	@Then("User should naviagate on Products screen")
	public void user_should_naviagate_on_products_screen() throws InterruptedException {
		 product=new productPageFactory(driver);
		product.prodPageNavigation();
		
		
		 
	    
	}
	
	


}

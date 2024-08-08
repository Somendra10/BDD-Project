package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.hooksClass;
import PageFactory.loginPageFactory;
import PageFactory.productPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productStepDefinitions {
	
	    WebDriver driver= hooksClass.driver;
	    loginPageFactory login;
	    productPageFactory product;
	
	
	
	@Given("User is on Products screen")
	public void user_is_on_products_screen() throws IOException {
	    
	      login=new loginPageFactory(driver);
	      product=new productPageFactory(driver);
		  login.enterValidEmail();
		  login.enterValidPsw();
		  login.clickLoginButton();
		  
			
	      
	}

	@When("User clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() {
	        product.clickOnAddToCart();
	}

	@Then("Cart icon should increase")
	public void cart_icon_should_increase() {
	    product.verifyCartIcon();
	}
	
	
	@And("User clicks on Remove button")
	public void user_clicks_on_remove_button() {
	   product.clickOnRemoveCart();
	}

	@Then("Product should show Add to cart button instead of Remove button")
	public void product_should_show_add_to_cart_button_instead_of_remove_button() {
		product.clickOnAddToCart();
		product.clickOnRemoveCart();
	    product.showAddtoCartButton();
	}
	

}

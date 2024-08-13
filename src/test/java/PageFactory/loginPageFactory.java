package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ConfigFile.readConfig;

public class loginPageFactory {

	     WebDriver driver;
	     readConfig configFile;
	    

	public loginPageFactory(WebDriver driver) throws IOException  {

		this.driver=driver;
		this.configFile= new readConfig();
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement username;

	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;

	@FindBy(xpath="//h3[@data-test='error']") 
	private WebElement loginErrorMsg;

	@FindBy(xpath ="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void userOnLoginScreen() {
		
		username.isDisplayed();
		
		
	}
		
	
	public void enterValidEmail() {
		
		String Email= configFile.getValidEmail();
		username.sendKeys(Email);
		
	}
	
	public void enterValidPsw() {
		
		String Password= configFile.getValidPassword();
		password.sendKeys(Password);
	}
	
	public void enterInvalidEmail() {
		
		String InvalidEmail= configFile.getInValidEmail();
		username.sendKeys(InvalidEmail);
		
	}
	
public void enterInvalidPassword() {
	
	String InvalidPassword= configFile.getInValidPassword();
	password.sendKeys(InvalidPassword);
		
		
	}

public void enterMultipleEmailPsw(String Email, String Password){
	
	username.sendKeys(Email);
	password.sendKeys(Password);
	
}
	
	
	public void clickLoginButton() {
		
		loginButton.click();
	}
	
	public void loginErrorMsg() {
		
		String exp= "Epic sadface: Username and password do not match any user in this servicee";
		String actual=loginErrorMsg.getText();
		Assert.assertEquals(actual, exp);
		
	}
	
	
	
	
	
	
	

}

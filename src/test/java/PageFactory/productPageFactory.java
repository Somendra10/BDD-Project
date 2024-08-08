package PageFactory;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class productPageFactory {
	
	     WebDriver driver;
	
	public productPageFactory(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath="//span[@class='title']")
			WebElement productTitle;
	
	@FindBy(xpath="//button[.='Add to cart']")
	private List<WebElement> addToCart;
	
	@FindBy(xpath="//button[.='Remove']")
	private List<WebElement> remove;
	
	@FindBy(className="shopping_cart_badge") 
	private WebElement cartIcon;
	
	public void prodPageNavigation() {
		
		productTitle.isDisplayed();
		
	}
	
	public void clickOnAddToCart() {
		
		addToCart.get(0).click();
	}

	public void verifyCartIcon() {
		String Actual= cartIcon.getText();
		String Exp= "1";
		Assert.assertEquals(Actual, Exp);
		
	}
	
	
public void clickOnRemoveCart() {
		
		remove.get(0).click();
	}

	public void showAddtoCartButton() {
		String Actual= addToCart.get(2).getText();
		String Exp= "Add to cart";
		Assert.assertEquals(Actual, Exp);
		
	}
}

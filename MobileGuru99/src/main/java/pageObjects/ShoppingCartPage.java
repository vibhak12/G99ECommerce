package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@title='Qty']")
	WebElement quantity;
	
	@FindBy(css="button.btn-update:nth-child(2)")
	WebElement updateButton;
	
	@FindBy(css=".item-msg")
	WebElement errorMsg;
	
	@FindBy(id="empty_cart_button")
	WebElement EmptyCartButton;
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement emptyCartMsg;
	
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void SetQuantity(String qty) {
		
		quantity.clear();
		quantity.sendKeys(qty);
		
	}
	
	public void ClickUpdateButton() {
		
		updateButton.click();
	}
	
	public String GetErrerMessage() {
		
		return errorMsg.getText();
	}
	
	public void ClickOnEmptyCart(){
		
		EmptyCartButton.click();
		
	}
	
	public String GetEmptyCartMessage(){
		
		return emptyCartMsg.getText();
	}
	
	
}

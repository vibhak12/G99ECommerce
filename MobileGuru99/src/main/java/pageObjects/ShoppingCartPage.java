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
	
	@FindBy(xpath="//button[contains(@class,'btn-proceed-checkout')]")
	WebElement checkoutButton;
	
	@FindBy(id="region_id")
	WebElement stateDropDown;
	
	@FindBy(id="postcode")
	WebElement postalCodeDropdown;
	
	@FindBy(xpath=".//*[@id='shipping-zip-form']/div/button")
	WebElement Estimate;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//button[@class='button']")
	WebElement BillingContinue;
	
	@FindBy(id="s_method_flatrate_flatrate")
	WebElement fixedRateRadioButton;
	
	@FindBy(xpath="//button[@title=\"Update Total\"]")
	WebElement UpdateTotalButton;
	
	@FindBy(xpath="//table[@id=\"shopping-cart-totals-table\"]//tr[2]//td[2]/span")
	WebElement FixedRatePrice;
	
	@FindBy(xpath="//div[@id=\"shipping-buttons-container\"]//button[@class=\"button\"]/span/span")
	WebElement ShippingContinue;
	
	@FindBy(xpath="//div[@id=\"shipping-method-buttons-container\"]//button/span/span")
	WebElement ShipingMethodContinue;
	
	@FindBy(id="p_method_checkmo")
	WebElement MoneyOrderCheckBox;

	@FindBy(xpath="//div[@id='payment-buttons-container']//button/span/span")
	WebElement PaymentInfoContinue;
	
	@FindBy(xpath="//button[contains(@class,'button btn-checkout')]")
	WebElement PlaceOrderButton;
	
	@FindBy(xpath="//div[@class=\"col-main\"]//p[1]/a")
	WebElement OrderNumber;
	
	
	
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
	
	public void ClickOnCheckOutButton() {
		
		checkoutButton.click();
	}
	
	public void ClickOnBillingContinueButton() {
		BillingContinue.click();
		
	}
	
	public void ClickOnFixedrateRadioButton() {
		
		fixedRateRadioButton.click();
	}
	
	public String GetFixedRatePrice() {
		
		return FixedRatePrice.getText();
	}
	
	public void ClickOnShippingContinue() {
		
		ShippingContinue.click();
	}
	public void ClickOnShippingMethodContinue() {
		
		ShipingMethodContinue.click();
	}
	
	public void ClickOnMoneyOrderCheckBox() {
		
		MoneyOrderCheckBox.click();
	}
	
	public void ClickOnPaymentInfoContinue() {
		
		PaymentInfoContinue.click();
	}
	
	public void ClickOnPlaceOrderButton() {
		
		PlaceOrderButton.click();
	}
	public String GetOrderNumber() {
		
		return OrderNumber.getText();
		
	}
	public void ClickOnUpdateTotalButton() {
		UpdateTotalButton.click();
	}
	
	public void SetStateDropDown(String state) {
		
		//stateDropDown.clear();
		stateDropDown.sendKeys(state);
	}
	
   public void SetPostalCodeDropDown(String postalcode) {
		
	
	   //postalCodeDropdown.clear();
	   postalCodeDropdown.sendKeys(postalcode);
	}

   public void ClickOnEstimateLink() {
	Estimate.click();
	
}

}


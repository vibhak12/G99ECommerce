package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	WebElement mobile;
	
	@FindBy(linkText="TV")
	WebElement tv;
	
	@FindBy(xpath="//span[@class='label' and text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//div[@class='links'][1]//a[@title='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//a[@title=\"Log In\"]")
	WebElement logInButton;

	@FindBy(linkText="My Wishlist")
	WebElement mywishlist;
	
	public HomePage(WebDriver driver){
		
		      this.driver=driver;
		      PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnMobile() {
		
		mobile.click();
		
	}
	
public void clickOnTV() {
		
		tv.click();
		
	}
	
	public String GetTitle() {
		
		return driver.getTitle();
	}

    public void ClickOnAccount(){
		
		account.click();
	}

	public void ClickOnMyAccount(){
		
		myAccount.click();
		
	}
	
    public void ClickOnLogIn(){
		
	logInButton.click();
		
	}

    public void ClickOnMyWishList(){
	
	mywishlist.click();
		
	}
}

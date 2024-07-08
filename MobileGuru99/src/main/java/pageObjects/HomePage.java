package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	WebElement mobile;
	
	@FindBy(xpath="//span[@class='label' and text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//div[@class='links'][1]//a[@title='My Account']")
	WebElement myAccount;

	
	public HomePage(WebDriver driver){
		
		      this.driver=driver;
		      PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnMobile() {
		
		mobile.click();
		
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
	
}

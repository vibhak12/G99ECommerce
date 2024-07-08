package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDetailsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@id=\"product-price-1\"]/span")
	WebElement productPrice;
	
	
	public MobileDetailsPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	
	public String GetMobilePrice() {
		
		return productPrice.getText();
	}
			

}

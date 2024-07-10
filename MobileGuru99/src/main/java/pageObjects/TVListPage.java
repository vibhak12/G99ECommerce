package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVListPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//li[@class='item last'][1]//a[@class=\"link-wishlist\"]")
	WebElement Add1stProdinWishList;
	
	@FindBy(xpath="//li[@class=\"item last\"][1]//h2[@class=\"product-name\"]/a")
	WebElement FirstTVName;
	
	public TVListPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void AddFirstTVWishList()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		Add1stProdinWishList.click();
		
	}
	public String GetFirstTVName()
	{
		
		return FirstTVName.getText();
		
	}
	
	
}

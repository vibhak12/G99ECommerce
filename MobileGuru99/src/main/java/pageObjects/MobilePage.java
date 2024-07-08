package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilePage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"category-products\"]/div[1]/div[@class=\"sorter\"]//select")
	WebElement positionDropdown;
	
	@FindBy(xpath="//div[@class=\"category-products\"]/div[1]/div[@class=\"sorter\"]//select/option[2]")
	WebElement selectedDropDownOPtion;
	
	@FindBy(xpath="//*[@id=\"product-price-1\"]/span")
	WebElement mobilePrice;
	
	@FindBy(xpath="//li[@class=\"item last\"][2]//h2[@class=\"product-name\"]/a")
	WebElement mobileName;
	
	@FindBy(xpath="//li[@class='item last'][2]//button[@class='button btn-cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath="//li[@class=\"item last\"][1]//a[@class=\"link-compare\"]")
	WebElement firstAddToCompare;
	
	@FindBy(xpath="//li[@class=\"item last\"][2]//a[@class=\"link-compare\"]")
	WebElement secondAddToCompare;
	
	@FindBy(xpath="//button[@title=\"Compare\"]")
	WebElement compareButton;
	
	
	public MobilePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickOnNameDropdown(String input) {
		
		//positionDropdown.click();
		Select select=new Select(positionDropdown);
		select.selectByVisibleText(input);		
		
		
		
	}
	
	public String GetSelctedDropDownOption() {
		
		String selectedOption=selectedDropDownOPtion.getAttribute("selected");
		System.out.println("value of selected attribute is ==" +selectedOption);
		return selectedOption;
		
	}
	
	public String GetTitle() {
		
		return driver.getTitle();
	}
	
	public String GetProductPrice()
    {
    	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//js.executeScript("arguments[0].scrollIntoView(true);", element); 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(mobilePrice));
		
		
		return mobilePrice.getText();	
    	
    }

    
    public void ClickOnMobileName() {
    	 
    	mobileName.click();
    	
    }
	
	public void ClickOnAddToCartButton(){
		
		addToCartButton.click();
	}

	public void AddTwoProductsToCompare(){
		
		firstAddToCompare.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		secondAddToCompare.click();
		
	}
	
	public void ClickOnCompareButton(){
		
		compareButton.click();
	}
	
	public String GetTitleOfComparePage(){
		
	      for(String win : driver.getWindowHandles()) {
			 
			 driver.switchTo().window(win);
			 
		 }
		 
		 return driver.findElement(By.tagName("h1")).getText();	
		
	}
	
}

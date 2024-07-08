package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetails {



 WebDriver driver;
  public AccountDetails(WebDriver driver){
			  
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
			  
		  }
		  
		  
		  @FindBy(xpath="//p[@class='hello']/strong")
		  WebElement dashboardMsg;
		  
		  
		  public String GetDashboardMsg(){
			  
			  return dashboardMsg.getText();
		  }
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


          WebDriver driver;
		  
      @FindBy(xpath="//span[text()='Create an Account']")
	  WebElement createAccountButton;


		  public LoginPage(WebDriver driver){
			  
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		  }

		  
		  public void ClickOnCreateAccountButton(){
			  
			  createAccountButton.click();
			  
		  }
 
}

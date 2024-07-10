package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


          WebDriver driver;
		  
      @FindBy(xpath="//span[text()='Create an Account']")
	  WebElement createAccountButton;

      
      @FindBy(id="email")
      WebElement email;
      
      @FindBy(id="pass")
      WebElement password;
      
      @FindBy(id="send2")
      WebElement LOGINButton;

		  public LoginPage(WebDriver driver){
			  
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		  }

		  
		  public void ClickOnCreateAccountButton(){
			  
			  createAccountButton.click();
			  
		  }
		  
		  public void SetEmailAddress(String UserEmail) {
			  
			  email.sendKeys(UserEmail);
		  }
		  
          public void SetUserPassword(String Pass) {
			  
			  password.sendKeys(Pass);
		  }
          
          public void ClickOnLogin() {
        	  
        	  LOGINButton.click();
        	  
          }
		   
}

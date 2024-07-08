package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {


          WebDriver driver;
		  
		 
		  
		  @FindBy(id="firstname")
		  WebElement firstname;
		  
		  @FindBy(id="lastname")
		  WebElement lastname;
		  
		  @FindBy(id="email_address")
		  WebElement Email;
		  
		  @FindBy(id="password")
		  WebElement password;
		  
		  @FindBy(id="confirmation")
		  WebElement confirmation;
		  
		  @FindBy(xpath="//span[text()='Register']")
		  WebElement register;
		  
		  
           public CreateAccountPage(WebDriver driver){
			  
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
			  
		  }
		  
		  
		  public void SetUserFirstName(String fname){
			  
	                
					firstname.clear();
					firstname.sendKeys(fname);
			  
		  }
		  
		  public void SetUserLastName(String lname){
			  
			  lastname.clear();
			  lastname.sendKeys(lname);
			  
		  }
		  
		   public void SetUserEmail(String email){
			  
			  Email.clear();
			  Email.sendKeys(email);
			  
		  }
		  
		  public void SetUserPassword(String pass){
			  
			  password.clear();
			  password.sendKeys(pass);
		  }
		  
		  public void SetPasswordConfirm(String repass){
			  
			  confirmation.clear();
			  confirmation.sendKeys(repass);
		  }
		  
		   public void ClickRegister(){
			  
			  register.click();
		  }
		 

}

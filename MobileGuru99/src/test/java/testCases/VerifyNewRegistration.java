package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountDetails;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SetupBase;

public class VerifyNewRegistration extends SetupBase{
	 
	
	   WebDriver driver;
	      HomePage homepage;
	      LoginPage login;
	      CreateAccountPage account;
		  AccountDetails dashboard;
	     
	      public String url="http://live.techpanda.org/index.php";
		  public String firstName = "BERRY";        
	      public String lastName = "BERRYTWO";
	         
	     @BeforeClass
	     public void TestSetup(){
	    	 
	    	 driver=OpenBrowser(url);
	    	 homepage=new HomePage(driver);
	    	 login=new LoginPage(driver);
	    	 account=new CreateAccountPage(driver);
			 dashboard= new AccountDetails(driver);
	     }      
	
	
	      @Test
		  public void TestRegistration() throws InterruptedException{
			  
			  homepage.ClickOnAccount();
			  Thread.sleep(1000);
			  
			  homepage.ClickOnMyAccount();
			  Thread.sleep(1000);
			  
			  login.ClickOnCreateAccountButton();
			  
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  
			  account.SetUserFirstName(firstName);
			  account.SetUserLastName(lastName);
			  account.SetUserEmail("Berry123@tpg.com.ap");
			  account.SetUserPassword("mar8mar");
			  account.SetPasswordConfirm("mar8mar");
			  account.ClickRegister();
			  
			  String actualMsg=dashboard.GetDashboardMsg();
			  String ExpectedMsg="Hello, "+firstName+" "+ lastName+"!";
			  Assert.assertEquals(actualMsg, ExpectedMsg);
			  
		  }
	      
	      @AfterClass
	      public void CloseBrowser() {
	    	   
	    	  driver.close();
	    	  
	      }

}

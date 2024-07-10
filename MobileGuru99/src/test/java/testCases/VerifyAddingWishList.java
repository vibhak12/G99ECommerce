package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountDetails;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SetupBase;
import pageObjects.TVListPage;
import utilities.Util;

public class VerifyAddingWishList extends SetupBase{
	
	WebDriver driver;
	HomePage homepage;
    AccountDetails myAcc;
    TVListPage tvpage;
    LoginPage login;
    String url=Util.url;
    
    @BeforeClass
    public void TestSetup(){
   	 
   	 driver=OpenBrowser(url);
   	 homepage=new HomePage(driver);
   	 myAcc= new AccountDetails(driver);
   	 login=new LoginPage(driver);
   	 tvpage=new TVListPage(driver);
   	
    }    
	
    
	@Test
	public void VerifyWishList() throws InterruptedException {
		
		homepage.ClickOnAccount();
		homepage.ClickOnLogIn();
		 Thread.sleep(1000);
		login.SetEmailAddress(Util.userName);
		 login.SetUserPassword(Util.userPass);
		 login.ClickOnLogin();
		 Thread.sleep(1000);
	    
		homepage.clickOnTV();
	    String Tvname=tvpage.GetFirstTVName();
	    tvpage.AddFirstTVWishList();
	    Thread.sleep(1000);
	    
	   
	    
	    String ActualMsg=myAcc.GetWishListSuccMsg();
	   	Assert.assertTrue(ActualMsg.contains(Tvname)); 
		
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.close();
	}
	
	

}

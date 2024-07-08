package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MobileDetailsPage;
import pageObjects.MobilePage;
import pageObjects.SetupBase;

public class VerifyProductCost extends SetupBase {
	
	
	
	 HomePage homepage;
     WebDriver driver;
     MobilePage mobilepage;
     MobileDetailsPage details;
     String url="http://live.techpanda.org/index.php";
        
    @BeforeClass
    public void TestSetup(){
   	 
   	
   	 driver=OpenBrowser(url);
   	 homepage=new HomePage(driver);
   	 mobilepage=new MobilePage(driver);
   	 details=new MobileDetailsPage(driver);
    }      
          
    
    @Test(priority=1)
    public void VerifyHomePageTitle() {
   	 
   	
   	 String actual=homepage.GetTitle();
   	 Assert.assertEquals(actual, "Home page");	    	 
    }
    
    @Test(priority=2)
    public void VerifyMobilePageTitle() {
   	 
   	 homepage.clickOnMobile();
   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   	 
   	 String actual=mobilepage.GetTitle();
   	 Assert.assertEquals(actual, "Mobile");
    }
          
    @Test(priority=3)
    public void VerifyCost() throws Exception {
      
    Thread.sleep(10000);
	
   	 String actualPrice=mobilepage.GetProductPrice();
   	 mobilepage.ClickOnMobileName();
   	 
   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   	 
   	 
   	String expected=details.GetMobilePrice();
   	 //String expected=mobilepage.GetSelctedDropDownOption();
   	 Assert.assertEquals(actualPrice, expected);
    }


    
    @AfterClass
    public void closeBrowser() {
  	  driver.close();
    }


}

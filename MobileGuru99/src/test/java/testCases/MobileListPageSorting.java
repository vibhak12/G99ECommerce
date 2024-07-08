package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MobilePage;
import pageObjects.SetupBase;

public class MobileListPageSorting extends SetupBase{
	
	     // SetupBase base;
	      HomePage homepage;
	      WebDriver driver;
	      MobilePage mobilepage;
	      String url="http://live.techpanda.org/index.php";
	         
	     @BeforeClass
	     public void TestSetup(){
	    	 
	    	
	    	 driver=OpenBrowser(url);
	    	 homepage=new HomePage(driver);
	    	 mobilepage=new MobilePage(driver);
	     }      
	           
	     
	     @Test
	     public void VerifyHomePageTitle() {
	    	 
	    	
	    	 String actual=homepage.GetTitle();
	    	 Assert.assertEquals(actual, "Home page");	    	 
	     }
	     
	     @Test
	     public void VerifyMobilePageTitle() {
	    	 
	    	 homepage.clickOnMobile();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 
	    	 String actual=mobilepage.GetTitle();
	    	 Assert.assertEquals(actual, "Mobile");
	     }
	           
	     @Test
	     public void VerifySortingOrder() {
	    	 
	    	 mobilepage.ClickOnNameDropdown("Name");
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 String actual=mobilepage.GetSelctedDropDownOption();
	    	 Assert.assertEquals(actual, "true");
	     }
	
	
	     
	     @AfterClass
	     public void closeBrowser() {
	   	  driver.close();
	     }

}

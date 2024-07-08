package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.MobilePage;
import pageObjects.SetupBase;

public class CompareTwoProducts extends SetupBase{
	
	
	      WebDriver driver;
	      MobilePage mobilepage;
	     
	      String url="http://live.techpanda.org/index.php/mobile.html";
	         
	     @BeforeClass
	     public void TestSetup(){
	    	 
	    	
	    	 driver=OpenBrowser(url);
	    	 mobilepage=new MobilePage(driver);
	     }      
	           
			   @Test
			   public void VerifyCompareProducts(){
				   
				   mobilepage.AddTwoProductsToCompare();
				   mobilepage.ClickOnCompareButton();
				   String actualTitle=mobilepage.GetTitleOfComparePage();
				   Assert.assertEquals("COMPARE PRODUCTS", actualTitle);
						   
			   }
	
	  
       @AfterClass
       public void CloseBrowser() {
    	   
    	   driver.quit();
       }
}

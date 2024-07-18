package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountDetails;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SetupBase;
import pageObjects.ShoppingCartPage;
import utilities.Util;

public class VerifyPurchasingTheProduct extends SetupBase{

	      WebDriver driver;
	      
	      String url=Util.url;
	      HomePage homepage;
	      LoginPage loginpage;
	      AccountDetails accountdetails;
	      ShoppingCartPage cart;
	      
	
	      @BeforeClass
	      public void Setup() {
	    	  
	    	  driver=OpenBrowser(url);
	    	  homepage=new HomePage(driver);
	    	  loginpage=new LoginPage(driver);
	    	  cart=new ShoppingCartPage(driver);
	    	  accountdetails= new AccountDetails(driver);
	      }
	      
	      @Test
	      public void SetupOrder() throws InterruptedException {
	    	  
	    	  homepage.ClickOnAccount();
	    	  homepage.ClickOnMyWishList();
	    	  loginpage.SetEmailAddress(Util.userName);
	    	  loginpage.SetUserPassword(Util.userPass);
	    	  loginpage.ClickOnLogin();
	    	  
	    	  accountdetails.ClickOnAddToCartButton();
	          cart.SetStateDropDown(Util.state);
	          cart.SetPostalCodeDropDown(Util.postalcode);
	          cart.ClickOnEstimateLink();
	          Thread.sleep(1000);
	    	  //boolean result=cart.IsFRRadioButtonChecked();
	    	  cart.ClickOnFixedrateRadioButton();
	    	  //Assert.assertTrue(cart.IsFRRadioButtonChecked());	
	    	  cart.ClickOnUpdateTotalButton();
	    	  Assert.assertEquals(cart.GetFixedRatePrice(), "$5.00");
	    	  cart.ClickOnCheckOutButton();
	    	  Thread.sleep(1000);
	    	  cart.ClickOnBillingContinueButton();
	    	  Thread.sleep(1000);
	    	 // cart.ClickOnShippingContinue();
	    	 // Thread.sleep(1000);
	    	  cart.ClickOnShippingMethodContinue();
	    	  Thread.sleep(1000);
	    	  cart.ClickOnMoneyOrderCheckBox();
	    	  Thread.sleep(1000);
	    	  cart.ClickOnPaymentInfoContinue();
	    	  Thread.sleep(1000);
	    	  cart.ClickOnPlaceOrderButton();
	    	  Thread.sleep(1000);
	    	  System.out.println("Order is placed successfully"+cart.GetOrderNumber());
	    	  
	      }
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
	
}

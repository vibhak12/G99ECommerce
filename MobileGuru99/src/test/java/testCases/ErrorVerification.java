package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MobilePage;
import pageObjects.SetupBase;
import pageObjects.ShoppingCartPage;

public class ErrorVerification extends SetupBase{
	
		  HomePage homepage;
	      WebDriver driver;
	      MobilePage mobilepage;
	      ShoppingCartPage cart;
	      String url="http://live.techpanda.org/index.php";
	         
	     @BeforeClass
	     public void TestSetup(){
	    	 
	    	
	    	 driver=OpenBrowser(url);
	    	 homepage=new HomePage(driver);
	    	 mobilepage=new MobilePage(driver);
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
	     public void VerifyErrorMessage() {
	    	// driver.findElement(By.xpath("//li[@class='item last'][2]//button[@class='button btn-cart']")).click();
			
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 		js.executeScript("window.scrollBy(0,350)", "");
	    	 mobilepage.ClickOnAddToCartButton();
	    	 
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 
	    	 cart=new ShoppingCartPage(driver);
	    	 cart.SetQuantity("10000");
	    	 cart.ClickUpdateButton();
			 
			 //driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
			 
			 //driver.findElement(By.cssSelector("button.btn-update:nth-child(2)")).click();
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 String errorMessage=cart.GetErrerMessage();
			 //String errorMessage= driver.findElement(By.cssSelector(".item-msg")).getText();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 String expected="* The maximum quantity allowed for purchase is 500.";
			 
			Assert.assertEquals(errorMessage, expected);
			 
	    	 }
			 
			 @Test(priority=4)
			 public void verifyEmptyCartMessage(){
				 
				 cart.ClickOnEmptyCart();
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 String ActualMsg=cart.GetEmptyCartMessage();
				 String ExpectedMsg= "SHOPPING CART IS EMPTY";
				 Assert.assertEquals(ActualMsg, ExpectedMsg);
			 
			 }
	
	
	     
	     @AfterClass
	     public void closeBrowser() {
	   	  driver.close();
	     }

		

}

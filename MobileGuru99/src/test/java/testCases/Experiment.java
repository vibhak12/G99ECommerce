package testCases;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Experiment {

	public void ClickonProductPage(WebDriver driver,String name) {
		
		
		driver.findElement(By.linkText(name)).click();
	
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\geckodriver.exe");
	   WebDriver driver= new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
		driver.get("http://live.techpanda.org/index.php/mobile.html");
		/*WebElement element=driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//js.executeScript("arguments[0].scrollIntoView(true);", element); 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		System.out.println("Price is -->"+element.getText());*/
		
		
		
		//driver.findElement(By.xpath("//li[@class=\"item last\"][2]//h2[@class=\"product-name\"]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//Experiment ex=new Experiment();
		//ex.ClickonProductPage(driver, "SONY XPERIA");
		
		 /*driver.findElement(By.xpath("//li[@class='item last'][2]//button[@class='button btn-cart']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		 
		 driver.findElement(By.cssSelector("button.btn-update:nth-child(2)")).click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 String errorMessage= driver.findElement(By.cssSelector(".item-msg")).getText();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 String expected="* The maximum quantity allowed for purchase is 500.";
		 
		 if(errorMessage.equals(expected)) {
			 
			 System.out.println("Test is passed");
		 } */
		 
		// Assert.assertEquals(errorMessage,expected);
		 
		/* List<WebElement> list=driver.findElements(By.xpath("//a[@class=\"link-compare\"]"));
		 
		 for(int i=0;i<=1;i++) {
		 
		 list.get(i).click();
		 }
		 
		 //JavascriptExecutor js1 = (JavascriptExecutor) driver;
			
		driver.findElement(By.xpath("//li[@class=\"item last\"][1]//a[@class=\"link-compare\"]")).click();
		
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//li[@class=\"item last\"][2]//a[@class=\"link-compare\"]")).click(); 
	 
		 //list.get(2).click();
		 
		 driver.findElement(By.xpath("//button[@title=\"Compare\"]")).click();
		 Thread.sleep(500);
		 
		 for(String win : driver.getWindowHandles()) {
			 
			 driver.switchTo().window(win);
			 
		 }
		 
		 System.out.println("Title of window is ==>"+driver.findElement(By.tagName("h1")).getText()); */
		 
		 
		 
		 
		 
		 driver.close();
		
		
		//driver.findElement(By.linkText("SONY XPERIA")).click();
		
		//driver.close();
		
		
	}

}

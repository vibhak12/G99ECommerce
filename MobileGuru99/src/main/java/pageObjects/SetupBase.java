package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetupBase {
	
	public WebDriver driver;
	String driverpath="D:\\Drivers\\geckodriver.exe";
	
	public WebDriver OpenBrowser(String url) {
		
		/*ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);*/
		
		
		System.setProperty("webdriver.firefox.driver", driverpath);
	    driver= new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
		driver.get(url);
		return driver;		
		
	}
	

}

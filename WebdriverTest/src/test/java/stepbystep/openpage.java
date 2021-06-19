package stepbystep;

import org.testng.annotations.Test;

import two.clickpage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class openpage {
	WebDriver driver;
	
  @Test(priority = 1)
  public void openingtheWebPage() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
  }
  
  
  @Test(priority = 2)
  public void selectingFlights() {
	  clickpage x = new clickpage();
	  x.gotoflight(driver);
  }
  
  @Test(priority = 3)
  public void scroll() {
	  
	  scrollingthepage d = new scrollingthepage();
	  d.scroll(driver);
	  
	  
  }
  @Test(priority = 4)
  
  public void selectingoptions() throws InterruptedException, EncryptedDocumentException, IOException {
	  fillingtheelements b = new fillingtheelements();
	  b.fill(driver);
  }
  
  @Test(priority = 5)
  public void closingwindow() throws InterruptedException {
	  finalclose a = new finalclose();
	  a.closethat(driver);
  }
  
}

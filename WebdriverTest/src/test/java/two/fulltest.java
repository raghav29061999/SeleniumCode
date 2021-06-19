package two;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class fulltest {
	WebDriver driver;
  @Test(priority=1)
  public void openingpage() {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void clickingoption() {
	  driver.findElement(By.xpath("//*[text()='Flights']")).click();
	  
  }
  @Test(priority=3)
  public void runningscreendown() throws InterruptedException {
	  Actions act = new Actions(driver);
	  for(int i =0 ; i<5 ; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
	  
  }
  
  @Test(priority=4)
  public void fillingoptions() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@value='roundtrip']")).click(); //trip side
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='passCount']")).sendKeys("2"); 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("Frankfurt");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='fromMonth']")).sendKeys("August");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='fromDay']")).sendKeys("4");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys("Sydney");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='First']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//select[@name='airline']")).sendKeys("Unified Airlines");
	  Thread.sleep(2000);
	   
  }
  @Test(priority=5)
  
  public void closingthewindow() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@type='image']")).click();
	  Thread.sleep(8000);
	  driver.close();
	  System.out.println("Raghav Executed it");
  }
  
}

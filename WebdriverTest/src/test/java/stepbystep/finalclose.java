package stepbystep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finalclose {
	public void closethat(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@type='image']")).click();
		  Thread.sleep(8000);
		  driver.close();
		  System.out.println("Raghav Executed it");
	}

}

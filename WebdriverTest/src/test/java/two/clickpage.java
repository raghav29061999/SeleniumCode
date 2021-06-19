package two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class clickpage{
	
	
	public void gotoflight(WebDriver driver) {
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
	}
}

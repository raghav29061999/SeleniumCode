package stepbystep;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingthepage {
	
	public void scroll(WebDriver driver) {
		
		 Actions act = new Actions(driver);
		  for(int i =0 ; i<5 ; i++) {
				act.sendKeys(Keys.ARROW_DOWN).perform();
	
}
	}
}
package One;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		
	}

}

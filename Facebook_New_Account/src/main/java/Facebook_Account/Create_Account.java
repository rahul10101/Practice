package Facebook_Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Create_Account {

	WebDriver driver;
    Web	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
}

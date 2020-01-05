package WndowHandle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandling {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.canarabank.com/english/");
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	String parentwindowhandle=driver.getWindowHandle();
	driver.findElement(By.xpath("//button[contains(text(), 'Net Banking (Retail/Corporate)')]")).click();
	Set<String> allWindows=driver.getWindowHandles();
	Iterator itr=allWindows.iterator();
	for(String child:allWindows) {
		if(!parentwindowhandle.equals(child)){
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).sendKeys("Rahul");
			driver.findElement(By.xpath("//input[@name=\"fldPassword\"]")).sendKeys("DEMO");
			driver.findElement(By.xpath("//input[@class=\"btn btn-default\"]")).click();
		driver.switchTo().window((String)itr.next());
		
		}
	}
	
	}
}

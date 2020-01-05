import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver= new ChromeDriver();
		driver.get("URL");
		//below line will click on "Click me" Button
		driver.findElement(By.xpath("xpathExpression")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Rahul"); // prompt alert
		alert.accept();// prompt alert
		//alert.accept();
		driver.findElement(By.xpath("fsd")).click();
		
		//

	}

}

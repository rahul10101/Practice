package WndowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/");
		String text=driver.findElement(By.xpath("//a[text()='S&P BSE SENSEX']")).getText();
		System.out.println(text);
	}

}

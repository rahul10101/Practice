import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WebTableHandling {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/");
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit,SECONDS);
		FluentWait wait=new FluentWait(driver);
		//driver.switchTo().frame("frame name");
		List<WebElement> securityList=driver.findElements(By.xpath("//tbody[@id='idbody']/tr/td[2]"));
		
		//FindElements methods return type is List
		Iterator<WebElement> itr=securityList.iterator();
		System.out.println("Number of Elements: "+securityList.size());
		int rowNum=1;
			while(itr.hasNext()) {
				if(element.getText().equalsIgnoreCase("S&P BSE SENSEX 50")) {
					System.out.println("Price of Asian Paint is "+driver.findElement(By.xpath("//tbody[@id='idTbody']/tr["+r"]"))).getText();
					break;
				}else {
					rowNum++;
				}
			}
		driver.quit();
	}

}

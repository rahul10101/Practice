import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select select=new Select(day);
		select.selectByValue("2");
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select Select1 = new Select(month);
		List<WebElement> allMonths=Select1.getOptions();
		if(allMonths.size()==13) {
			System.out.println("Options are correct");
			
		}else {
			System.out.println("Options are Incorrect");
		}
		
		/*
		Select1.selectByValue("3");
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select select3=new Select(year);
		select3.selectByVisibleText("1987");
		
		*/
	}

}

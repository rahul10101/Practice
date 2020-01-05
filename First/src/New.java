import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New {

	public static void main(String[] args) {
		// WebElement element;
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-infobars");
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		dr.findElement(By.className("gb_g")).click();
		dr.navigate().back();
		// dr.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Vision IT");
		WebElement er = dr.findElement(By.xpath("//input[@title=\"Search\"]"));
		er.sendKeys("Vision IT, Kothrud");
		er.sendKeys(Keys.ENTER);
		// dr.findElement(By.className("\"gLFyf gsfi\"")).sendKeys("Vision IT");
	}
}

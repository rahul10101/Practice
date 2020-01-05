import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testtesng {
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void checkloginwithInvalidCredentials()
	{
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahul.bhujbal10@gmail.com");;
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("aloha@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	
	@Test
	public void CheckResetPasswordLinkWhenUserForgetPass()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahul.bhujbal10@gmail.com");;
		driver.findElement(By.xpath("")).click();
		
		
	}
	

}

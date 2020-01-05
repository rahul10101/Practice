import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Ashotscreenshot {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		AShot ashot = new AShot();
		// Screenshot sc=ashot.takeScreenshot(driver);
		// ImageIO.write(sc.getImage(),"PNG", new
		// File("screenahots/fullpagescreen.png"));
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "JPG", new File("C:\\Users\\fullpage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
	String driverPath = "C:\\Developement\\Lib\\";
	public WebDriver driver;

	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
		driver = new FirefoxDriver();

		driver.navigate().to("http://www.google.com");
		if (driver != null) {
			driver.close();
		}
	}
}

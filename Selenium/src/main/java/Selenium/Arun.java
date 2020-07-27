package Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Arun {
	@Test
	public void data() throws MalformedURLException {

		new DesiredCapabilities();
		DesiredCapabilities dc = DesiredCapabilities.chrome();

		// dc.setBrowserName("chrome");
		// dc.setPlatform(Platform.ANY);

		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, dc);

		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.javatpoint.com/");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}

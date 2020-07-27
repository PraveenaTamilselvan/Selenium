
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorToScroll {
	@Test
	public void scroll() throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		// options.setHeadless(true);
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
//		// HTMLUnitDriver driver = new HTMLUnitDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MINUTES);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://jquery.com/");

		// ((JavascriptExecutor) driver).executeScript("scroll(0,8000)");

		System.out.println(driver.getTitle());

	}
}

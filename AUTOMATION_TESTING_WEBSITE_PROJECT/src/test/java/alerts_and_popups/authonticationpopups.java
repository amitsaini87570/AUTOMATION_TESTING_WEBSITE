package alerts_and_popups;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_package.basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class authonticationpopups extends basetest {
	@Test
	public static void authontication_popups() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// without prefill idand password
		// driver.get("https://the-internet.herokuapp.com/basic_auth");

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

	}

}

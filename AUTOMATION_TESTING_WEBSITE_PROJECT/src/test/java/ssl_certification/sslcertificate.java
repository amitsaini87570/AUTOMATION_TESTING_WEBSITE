package ssl_certification;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslcertificate {
	@Test
	public static void sslCertify() {

		WebDriverManager.chromedriver().setup();

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions co = new ChromeOptions();
		co.merge(dc);

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://expired.badssl.com");
		driver.manage().window().maximize();

	}

}

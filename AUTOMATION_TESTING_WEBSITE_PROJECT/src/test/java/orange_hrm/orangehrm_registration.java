package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm_registration {
	@Test
	public static void hrm_login() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/en/contact-sales/");
		driver.manage().window().maximize();

		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("amit");

		driver.findElement(By.xpath("//input[@id = 'Form_getForm_Contact']")).sendKeys("9057388979");

		driver.findElement(By.name("Email")).sendKeys("amitsaini8757@gmail.com");

	}

}

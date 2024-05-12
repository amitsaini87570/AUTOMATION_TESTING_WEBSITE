package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwait {
	@Test
	public static void explicit_wait() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath(
				"/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"));
		w.sendKeys("mobiles");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input"))).click();

		 driver.findElement(By.xpath("/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input")).click();

	}

}

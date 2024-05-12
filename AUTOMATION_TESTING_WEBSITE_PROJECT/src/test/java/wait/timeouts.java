package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timeouts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"));
		w.sendKeys("mobiles");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input")).click();
		
		
	}

}

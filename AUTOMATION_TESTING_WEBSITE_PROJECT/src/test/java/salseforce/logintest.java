package salseforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	@Test
	public static void salse_force() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();

		// driver.findElement(By.id("rejectInvite")).click();
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input"))
				.sendKeys("amit");
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input"))
				.sendKeys("saini");
		WebElement w = driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/select"));

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/input"))
				.sendKeys("amitsaini87570@gmail.com");
		// w.click();
		Select s = new Select(w);
		s.selectByIndex(1);

		// Thread.sleep(5000);
		// driver.findElement(By.id("rejectInvite")).click();

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[1]/div/div/input"))
				.sendKeys("cnc");

		WebElement e = driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/div/div[2]/div/div/select"));
		Select se = new Select(e);
		se.selectByIndex(2);

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[4]/div/div[1]/div/div/input"))
				.sendKeys("9057388979");

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[5]/div/div/div[1]"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[11]/button\r\n"))
				.click();

	}

}

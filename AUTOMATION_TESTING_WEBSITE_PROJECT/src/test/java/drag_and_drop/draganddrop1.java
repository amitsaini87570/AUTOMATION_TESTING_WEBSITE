package drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop1{
	@Test
	public static void draganddrop1() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement dg = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[3]/img"));

		WebElement dp = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div"));

		a.dragAndDrop(dg, dp).perform();

	}

}

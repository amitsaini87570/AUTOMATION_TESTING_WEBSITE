package drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop2 {
	@Test
	public static void dropdown2() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Dynamic.html");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement w = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[3]/img"));
		a.moveToElement(w).perform();
		WebElement dg = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[3]/img"));
		WebElement dp = driver.findElement(By.xpath("//*[@id=\"msg\"]"));

		a.dragAndDrop(dg, dp).perform();

	}

}

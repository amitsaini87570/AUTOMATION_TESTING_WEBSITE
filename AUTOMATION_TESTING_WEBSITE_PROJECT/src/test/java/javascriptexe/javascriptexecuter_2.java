package javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecuter_2 {
	@Test
	public static void javascriptexecuter__2() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		JavascriptExecutor jsexec = (JavascriptExecutor) driver;

		// print title
		String script_title = "return document.title;";
		String title = (String) jsexec.executeScript(script_title);
		System.out.println(title);

		// click alert button
		driver.switchTo().frame("iframeResult");
		driver.manage().window().maximize();

		jsexec.executeScript("myFunction()");
		driver.switchTo().alert().accept();

		// scroll
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[17]/div/a"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", btn);
		// btn.click();

	}

}

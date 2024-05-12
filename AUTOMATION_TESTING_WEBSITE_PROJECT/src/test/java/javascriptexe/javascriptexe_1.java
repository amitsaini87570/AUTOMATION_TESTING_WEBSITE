package javascriptexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexe_1 {
	@Test
	public static void javascriptexe1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		JavascriptExecutor js = ((JavascriptExecutor) driver);

//print title
		String title = (String) js.executeScript("return document.title;");
		System.out.println(title);

//scroll
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);

//click button
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"Button1\"]"));
		// js.executeScript("arguments[0].click();",submit);

//highlite  button
		WebElement hb = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		js.executeScript("arguments[0].style.border='5px solid red'", hb);

// refresh page
//   js.executeAsyncScript("history.go(0)");

//   generate alert

		js.executeScript("alert(' is alert message')");

// accept alert
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
	}
}

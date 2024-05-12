package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();

		WebElement r = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div"));
		System.out.println(r.getSize());

	}

}

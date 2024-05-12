package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table2 {
	@Test
	public static void table() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();

		int r = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr")).size();
		System.out.println("total no of rows are = " + r);

		int c = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th")).size();
		System.out.println("total no of coloums  are = " + c);

		WebElement ele = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[2]/td[3]"));
		System.out.println("value at 2,3 is are = " + ele.getText());

		// whole table

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {

				String data = driver.findElement(By.xpath("//table[@id='table02']//tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(data);
			}

		}

	}

}

package keyboard_and_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();

driver.get("https://www.ebay.com");

WebElement w = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
  Actions a = new Actions(driver);
  a.moveToElement(w).perform();
	}

}

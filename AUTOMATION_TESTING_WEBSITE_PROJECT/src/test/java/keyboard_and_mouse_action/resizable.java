package keyboard_and_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://seleniumbase.io/demo_page");
driver.manage().window().maximize();

Actions a = new Actions(driver);

WebElement sa = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input"));
sa.sendKeys("amit saini");
 a.keyDown(sa,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();


WebElement da = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[4]/textarea"));

     a.keyDown(da,Keys.CONTROL).sendKeys("v").build().perform();


	}

}

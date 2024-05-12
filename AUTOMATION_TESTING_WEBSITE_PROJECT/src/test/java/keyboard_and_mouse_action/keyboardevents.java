package keyboard_and_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardevents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
        Actions action = new Actions(driver);
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
        WebElement destinationArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
        action.keyDown(sourceArea,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        action.keyDown(destinationArea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}
}

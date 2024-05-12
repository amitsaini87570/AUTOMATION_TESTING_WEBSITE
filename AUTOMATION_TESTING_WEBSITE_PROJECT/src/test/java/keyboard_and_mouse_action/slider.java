package keyboard_and_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Slider.html");
		driver.manage().window().maximize();

		WebElement w = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/a"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(w,500,0).perform();

		a.contextClick(w).perform();
		
		
	}

}

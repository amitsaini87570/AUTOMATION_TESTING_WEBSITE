package window_handles;

import java.util.Set;
import java.awt.Desktop.Action;


import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();


		Set <String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		
		Iterator<String> it = windowhandles.iterator();
		
		String pw = it.next();
		System.out.println(pw);
		
		String cw = it.next();
		System.out.println(cw);
		
		
		
		
		driver.switchTo().window(cw);
		 driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[4]/a/span")).click();

			
			WebElement t =	 driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[1]/p[4]/a"));

			Actions a = new Actions(driver);
			a.moveToElement(t);
			a.perform();
			
			 driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[1]/p[4]/a")).click();

		

	}

}

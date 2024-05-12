package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle3 {

	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Windows.html");
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

     driver.manage().window().maximize();
    
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
     
     

Set<String> wh = driver.getWindowHandles();
System.out.println(wh);

Iterator<String> i = wh.iterator();
String pw =i.next();
String cw = i.next();
driver.switchTo().window(cw);

System.out.println(pw);
System.out.println(cw);


driver.manage().window().maximize();


		

     
     
	}

}

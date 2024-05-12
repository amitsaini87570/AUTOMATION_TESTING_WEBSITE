package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		
		int r = driver.findElements(By.xpath("//table[@id=\"table01\"]/tbody/tr")).size();
		System.out.println("total no of rows are = " +r);
		
		
		int c = driver.findElements(By.xpath("//table[@id='table01']/thead/tr/th")).size();
		System.out.println("total no of coloums  are = " +c);
		
		WebElement ele = driver.findElement(By.xpath("//table[@id=\"table01\"]/tbody/tr[2]/td[3]"));
		System.out.println("value at 2,3 is are = " +ele.getText());
		
		//whole table
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				String data = driver.findElement(By.xpath("//table[@id=\"table01\"]//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(" data is  "+ data );
				
			}

		}
		
		
		
		//print specific element manual and automation of first row
		String manual = driver.findElement(By.xpath("//table[@id=\"table01\"]/tbody/tr/td[2]")).getText();
		String automation = driver.findElement(By.xpath("//table[@id=\"table01\"]/tbody/tr/td[3]")).getText();
		System.out.println(manual+"          "+automation);

		
	}

}

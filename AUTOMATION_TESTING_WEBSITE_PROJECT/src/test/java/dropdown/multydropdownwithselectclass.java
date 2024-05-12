package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multydropdownwithselectclass {
	
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		//skill
	WebElement skill =	driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
	selectvalues(skill ,"C++") ;
		
	
// year
	WebElement year =	driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
	selectvalues(year ,"1999") ;

	}
	
	public static void selectvalues(WebElement ele,String value) {
		Select s = new Select(ele);
	List<WebElement> alloptions = s.getOptions();
	
	for(WebElement option :alloptions) {
		if(option.getText().equals(value)) {
			option.click();
			break;
		}
	}
		
		
		
		
		
		
		
		

	}

}

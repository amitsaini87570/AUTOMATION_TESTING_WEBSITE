// dropdown elements  which are not  in select class present then we have to click  on dropdownwebelement
// if select class present in element then there is not necessary on click on dropdownwebelement

package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownwtoutselect2 {

	static WebDriver driver;

	@Test
	public static void dropdownwtout_select2() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		// selectvaluess("//*[@id=\"Skills\"]/option","Analytics");
		// hare in the skill option is select class so, there is no need to click on the
		// web element

		selectvaluess("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li", "Danish");
// in the language option there is need to click on web element
	}

	public static void selectvaluess(String dropdownvalues, String value) {

		// clciking on the web element because hare is no select class on the web page
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();

		List<WebElement> alloption = driver.findElements(By.xpath(dropdownvalues));
		for (WebElement alloptions : alloption) {
			if (alloptions.getText().equals(value)) {
				alloptions.click();
				break;
			}
		}

	}
}
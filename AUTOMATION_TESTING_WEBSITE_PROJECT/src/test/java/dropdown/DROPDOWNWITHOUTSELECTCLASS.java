// dropdown elements  which are not  in select class present then we have to click  on dropdownwebelement
// if select class present in element then there are not necessary on click on dropdownwebelement

package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROPDOWNWITHOUTSELECTCLASS {

	static WebDriver driver;

	@Test
	public static void DROPDOWNWITHOUTSELECT_CLASS() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.manage().window().maximize();

		// gender
		selectvaluess("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[3]/div[2]",
				"//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[3]/div[2]/div[2]/div", "Female");

		// friends"
		selectvaluess("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[5]/div",
				"//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[5]/div/div[2]/div", "Matt");

		// country
		selectvaluess("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[6]/div/input[2]",
				"//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[6]/div/div[2]/div", "Japan");

		// state
		selectvaluess("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[7]/div/input",
				"//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[7]/div/div[2]/div", "Indiana");

	}

	public static void selectvaluess(String dropdown, String dropdownvalues, String value) {
		WebElement dropdownWebElement = driver.findElement(By.xpath(dropdown));
		dropdownWebElement.click();

		List<WebElement> alloption = driver.findElements(By.xpath(dropdownvalues));
		for (WebElement alloptions : alloption) {
			if (alloptions.getText().equals(value)) {
				alloptions.click();
				break;
			}
		}

	}
}

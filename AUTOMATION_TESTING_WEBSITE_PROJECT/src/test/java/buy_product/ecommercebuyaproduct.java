package buy_product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ecommercebuyaproduct {
	@Test
	public static void buy_product() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();

		// email
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("amitsaini87570@gmail.com");
		// password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("amitilove12345");
		// submit
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// shop
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		// scroll
		WebElement scr = driver.findElement(By.xpath("//*[@id=\"mc4wp_form_widget-2\"]/h4"));

		Actions act = new Actions(driver);
		act.moveToElement(scr);
		act.perform();

		// click on book
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]")).click();
		// driver.manage().timeouts().implicitlyWait(5, null);
		// view bascate
		WebElement basket = driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]"));
		basket.click();

		// proceedtocheckout
		WebElement chk = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a"));
		chk.click();

//bill details

		// firstname
		driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("amit");
//lastname
		driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("saini");

		// phone no
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("9057388979");

		// scrolldown
		WebElement scr11 = driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]"));
//	Actions act11 = new Actions(driver);
		act.moveToElement(scr11);
		act.perform();

		// adress
		// *[@id="billing_address_1"]
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("alwar");

		// town city
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("alwar");

		// *[@id="billing_postcode"]
		// postelcoad

		driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("301001");

		// scroll2
		WebElement scrl2 = driver.findElement(By.xpath("//*[@id=\"mc4wp_form_widget-2\"]/h4"));

		Actions act2 = new Actions(driver);
		act2.moveToElement(scrl2);
		act2.perform();

		// placeorder
		// *[@id="place_order"]
		driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();

		driver.switchTo().alert().dismiss();

		// scrool

		WebElement scrl3 = driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input"));

		Actions act3 = new Actions(driver);
		act3.moveToElement(scrl3);
		act3.perform();

		// email for subscribe
		driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[1]/input"))
				.sendKeys("amitsaini87570@gmail.com");

		// subscribe
		// *[@id="mc4wp-form-1"]/div[1]/p[2]/input

		driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input")).click();

	}
}

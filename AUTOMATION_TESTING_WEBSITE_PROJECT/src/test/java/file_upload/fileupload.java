package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {
	@Test
	public static void upload_file() throws AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		// 1. using senkeys
		// driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("E:\\selenium_projects\\AUTOMATION_LAB_PROJECT\\src\\test\\resources\\testdata\\a.pdf");

		// 2. using robot class

		driver.findElement(By.xpath("//*[@id=\"section\"]/div/div/div[3]/div[2]")).click();
		Robot rb = new Robot();
		rb.delay(2000);
		// put path to file in clipboard
		StringSelection ss = new StringSelection(
				"E:\\selenium_projects\\AUTOMATION_LAB_PROJECT\\src\\test\\resources\\testdata\\a.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);

		// press enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}

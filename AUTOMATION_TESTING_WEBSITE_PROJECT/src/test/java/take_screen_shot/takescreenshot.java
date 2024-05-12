package take_screen_shot;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class takescreenshot extends basetest {
	@Test
	public static void screen_shot() throws IOException {

		Date currentdate = new Date();
		String ssfn = currentdate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(ssfn);

		File ssf = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssf, new File("E:\\selenium_projects\\AUTOMATION_LAB_PROJECT\\src\\test\\java" + ssfn + ".png"));

	}

}

package read_property_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class readproperfile {
	@Test
	public static void read_property_file() throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\selenium_projects\\AUTOMATION_LAB_PROJECT\\src\\test\\resources\\confligs\\config.properties");

		p.load(fis);

		System.out.println(p.getProperty("testurl"));

		FileOutputStream fos = new FileOutputStream(
				"E:\\selenium_projects\\AUTOMATION_LAB_PROJECT\\src\\test\\resources\\confligs\\config.properties");

		p.setProperty("testdata", "123456");
		p.store(fos, "this is amit saini");
	}

}

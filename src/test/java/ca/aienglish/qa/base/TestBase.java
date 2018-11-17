package ca.aienglish.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	/*
	 * init: web driver properties logs Extendreport DB Excel Mail
	 * 
	 */

	// http://www.way2automation.com/angularjs-protractor/banking/#/login

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();

	public static FileInputStream fis;

	@BeforeSuite
	public void setUp() {
		if (driver == null) {

			Path configProp = Paths.get("src", "test", "resources", "properties", "Config.properties");
			Path ORProp = Paths.get("src", "test", "resources", "properties", "OR.properties");

			try {
				fis = new FileInputStream(configProp.toAbsolutePath().toString());
				config.load(fis);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(ORProp.toAbsolutePath().toString());
				OR.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	@AfterSuite
	public void tearDown() {

	}

}

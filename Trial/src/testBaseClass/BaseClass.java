package testBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
public static WebDriver driver= new ChromeDriver();
}

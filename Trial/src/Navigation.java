import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(2000);
driver.navigate().to("https://www.youtube.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
System.out.println("Executed successfully");


	}

}

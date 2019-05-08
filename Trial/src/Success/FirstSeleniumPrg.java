package Success;
										// open page and get its title and current url
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPrg {
	public static void main(String[] args) throws InterruptedException { // interrupted exception:- method is called with in a method
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//which driver and where is it located
		WebDriver driver= new ChromeDriver(); // creating obj. of chrDriver where return type is of superclass
		driver.get("https://www.google.com");//address of required page 
		Thread.sleep(6000);// page stays in same mode for that respective milliseconds 
		String title= driver.getTitle(); //gets title of page
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());// gets url and prints directly , because of this we are using interrupt throws exception.
														//Incase if we were storing valve returned by getcurrenturl() in a variable then we would have not used InterruptedException
		driver.close();
		
	}

}

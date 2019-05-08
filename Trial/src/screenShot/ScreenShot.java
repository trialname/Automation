package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import testBaseClass.BaseClass;


public class ScreenShot extends BaseClass{
	public static void main(String[] args) throws IOException {
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile);
		File dstFile = new File("./Screenshots/facebookpage.png");
		Files.copy(srcFile, dstFile);
		driver.close();
		

	}

}

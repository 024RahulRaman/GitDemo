package SeleniumSession;

import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
      //FileUtils.copyFile(src, newFile("/Users/rahulraman/eclipse-workspace/XYZ/src/SeleniumSession/amazon.png"));

	}

	
	
	
}

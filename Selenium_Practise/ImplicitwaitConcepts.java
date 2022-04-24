package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

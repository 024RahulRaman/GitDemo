package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//updated from Stack Overflow
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		driver.get("htpp://www.Google.com");
				driver.navigate().to("http://www.amazon.in");
				driver.navigate().back();
				
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().back();
				driver.navigate().refresh();
		
	}

}

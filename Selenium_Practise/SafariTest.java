package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SafariTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.get("google.com");	
	System.out.println(driver.getTitle());
	}

}
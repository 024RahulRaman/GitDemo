package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.xpath("//input[@class = 'nav-input nav-progressive-attribute']")).sendKeys("Java Book"); 
		//driver.findElement(By.xpath("//input[@name = 'field-keywords']")).sendKeys("Java Book");
		driver.findElement(By.xpath("//input[contains(@class,'nav-input nav-progressive-attribute')]")).sendKeys("Java Book");		
		driver.quit();

	}

}

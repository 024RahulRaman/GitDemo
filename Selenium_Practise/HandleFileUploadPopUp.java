package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("/Users/rahulraman/Desktop/test2(5).txt");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
        driver.quit();
	}

}

package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"))).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Fire TV']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='All-new Fire TV Stick (3rd Gen)']")).click();
		
		
		
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Movers and Shakers")).click();

		
		
		
		
	}

}

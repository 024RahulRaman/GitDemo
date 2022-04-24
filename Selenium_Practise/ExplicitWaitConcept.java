package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	

		
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
			WebDriver driver = new ChromeDriver();
		
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("http://www.google.com");
		///	clickOn(driver, driver.findElement(By.xpath("//button[@id='u_0_d_Pn']")));

			
			driver.get("http://google.com");
			String title = driver.getTitle();
			
			
			}

		//@Deprecated
		public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			
		}
		
		
}

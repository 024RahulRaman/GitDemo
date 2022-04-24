package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.seleniumqa.selenium.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		//ByXpath
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rahul");
		//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Raman");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("0000XXXXX123");
		
		//By Id
		//driver.findElement(By.id("firstName")).sendKeys("Rahul");
		//driver.findElement(By.id("lastName")).sendKeys("Raman");
		//driver.findElement(By.id("username")).sendKeys("0000XXXXX123");
		
		
		//By Name
		
		driver.findElement(By.name("firstName")).sendKeys("Rahul");
		driver.findElement(By.name("lastName")).sendKeys("Raman");
		driver.findElement(By.id("username")).sendKeys("0000XXXXX123");
		
		
		// Link text
		
		driver.findElement(By.linkText("Sign in instead")).click();
		
		
		
	}

}

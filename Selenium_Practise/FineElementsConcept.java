package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FineElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		 
        System.out.println(linklist.size());
        for(int i=0; i<linklist.size();i++){
       
	String LinkText = linklist.get(i).getText();
	System.out.println(LinkText);
        
        
          
		
		
		}

	}}

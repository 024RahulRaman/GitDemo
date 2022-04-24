package SeleniumSession;

import org.openqa.selenium.WebDriver;
//import org.seleniumqa.selenium.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//FF browser:
		//geckodriver
		
		//System.setProperty("webdriver.gecko.driver","/Users/rahulraman/Desktop/geckodriver");
		
	//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
	
		
		
		
		
//System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
	//WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	String title = driver.getTitle();
	
	System.out.println(title);
	if(title.equals("Google")){
		System.out.println("correct title");}
		
	else {
		System.out.println("In correct title");
	}
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	driver.quit();
	
	}

}

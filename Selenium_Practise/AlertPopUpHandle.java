package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rahulraman/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        
      String text= alert.getText();
        if(text.equals("Please enter a valid user name")) {
       System.out.println("correct alert message");
        }
        else {
        	
        System.out.println("incorrect alert message");
        } 
       alert.accept();
	}

}

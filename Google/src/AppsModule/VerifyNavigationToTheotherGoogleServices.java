package AppsModule;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyNavigationToTheotherGoogleServices {

	public static void main(String[] args) throws IOException {
		
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 driver.get("https://www.google.com/");
			WebElement appfrem = driver.findElement(By.xpath("//a[contains(@aria-label,'Google apps')]"));
			 appfrem.click();
			 driver.switchTo().frame("app");
			WebElement gmaillink = driver.findElement(By.xpath("//span[contains(.,'Gmail')]"));
			gmaillink.click();
			
	}

}

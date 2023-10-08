package JavaScE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToScrollHorizontaly {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver= new FirefoxDriver();
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.kwokyinmak.com");
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   
	   js.executeScript("Window.scrollBy(2000,0)");
	    
	}

}

package imageModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheImageSectionFunctionality {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.google.com/");
		WebElement imagelink= driver.findElement(By.linkText("Images"));
		imagelink.click();
		driver.findElement(By.id("APjFqb")).sendKeys("Flowers");
		driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
	}

}

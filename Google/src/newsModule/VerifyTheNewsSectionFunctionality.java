package newsModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheNewsSectionFunctionality {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.google.com/");
		WebElement appfrem = driver.findElement(By.xpath("//a[contains(@aria-label,'Google apps')]"));
		 appfrem.click();
		 driver.switchTo().frame("app");
		 WebElement maplink = driver.findElement(By.xpath("//span[contains(.,'News')]"));
			maplink.click();
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search for topics, locations & sources')]")).sendKeys("Orissa news");

	}

}

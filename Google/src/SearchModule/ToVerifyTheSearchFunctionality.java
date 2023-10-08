package SearchModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheSearchFunctionality {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		 driver.get("https://www.google.com/");
		/* FileInputStream fis = new FileInputStream("./TestData/C:\\Users\\hp\\eclipse-workspace_SeleniumAaliyaApril\\Google\\Testdata\\GoogleTestCase.xlsx");
	       Workbook workbook = WorkbookFactory.create(fis);
	       Sheet sheet = workbook.getSheet("Sheet1");
	       Row row = sheet.getRow(6);
			Cell cell = row.getCell(2);
			String td=cell.getStringCellValue();*/

	   
           driver.findElement(By.name("q")).sendKeys("selenium");
           driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
      
	       
	       
	}

}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		
		
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
				
	    //Open browser chrome
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		
		uploadFile.sendKeys("C:\\Users\\Lenovo\\Desktop\\cvv\r");
		
		
		
		

	}

}

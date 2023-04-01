package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
	
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
				
	    //Open browser chrome
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://demoqa.com/alerts");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Click on button click me
		driver.findElement(By.id("alertButton")).click();
		
		//Accept Alert //click ok
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println("Title of the page is : "+ title);
		driver.quit();
       
		
	}

}

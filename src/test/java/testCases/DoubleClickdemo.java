package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickdemo {

	public static void main(String[] args) {
		
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
	    
	    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		
				
	    //Open browser chrome
		WebDriver driver = new ChromeDriver(options);

		//Open URL
		driver.get("https://demoqa.com/buttons");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Instantiate Action class
		Actions action = new Actions(driver);
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		
		//message  is displayed
		String messageBtnDoubleClick = driver.findElement(By.id("doubleClickMessage")).getText();
				
		Assert.assertEquals( messageBtnDoubleClick , "You have done a double click");
		
		System.out.println("Successfully");
		
		driver.quit();
	}

}

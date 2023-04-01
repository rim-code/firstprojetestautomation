package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
				
	    //Open browser chrome
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://demoqa.com/buttons");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Instantiate Action class
		Actions action = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(btnRightClick).perform();
		
		
		//message  is displayed
		String messageRightClick = driver.findElement(By.id("rightClickMessage")).getText();
						
		Assert.assertEquals( messageRightClick , "You have done a right click");
		System.out.println("Successfully");
		
		driver.quit();

		
	
	}

}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
	
	    //Open browser chrome
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser
		 driver.manage().window().maximize();

		//Open URL
		driver.get("https://demoqa.com/menu/");
		
		Actions action = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
		
		action.moveToElement(mouseHover).perform();
		driver.quit();
		
	}
}

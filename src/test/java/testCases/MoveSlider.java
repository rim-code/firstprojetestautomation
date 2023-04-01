package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSlider {

	public static void main(String[] args) {

		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://demoqa.com/slider/");

		Actions action = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		action.moveToElement(slider, 50, 0).perform();
		slider.click();
		driver.quit();
		
		
	} 

}

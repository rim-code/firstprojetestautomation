package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {

		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://demoqa.com/text-box");

		// Find WebElement
		WebElement fullNameTxt = driver.findElement(By.id("userName"));
		WebElement emailTxt = driver.findElement(By.id("userEmail"));
		WebElement currentAddressTxt = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddressTxt = driver.findElement(By.id("permanentAddress"));

		Actions action = new Actions(driver);
		action.sendKeys(fullNameTxt, "Rim").perform();
		action.sendKeys(emailTxt, "friouirim@gmail.com").perform();
		action.sendKeys(currentAddressTxt, "Sfax").perform();
		
		action.keyDown(currentAddressTxt, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddressTxt, Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		

	}

}

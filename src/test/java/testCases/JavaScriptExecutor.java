package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://demoqa.com/browser-windows");

		// Maximize browser
		driver.manage().window().maximize();
		
		//Click On Button New Window Message With JavascriptExecutor 
		
		//WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();",newWindowMessage);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//Scroll Down
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)", "");
			
	}

}

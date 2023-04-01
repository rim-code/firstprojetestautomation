package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Read chrome Driver exe
				System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
						
				//Open browser chrome
				WebDriver driver = new ChromeDriver();
						
				//Open URL
				driver.get("https://www.facebook.com/");
						
				//Fill email
				driver.findElement(By.id("email")).sendKeys("rim_frioui123@yahoo.com");
						
				//Fill Password
				driver.findElement(By.id("pass")).sendKeys("rim21208889");
				
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					       .withTimeout(Duration.ofSeconds(60))
					       .pollingEvery(Duration.ofSeconds(2));
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_5_gV"))).click();
						
					      
				driver.quit();
		
		
	}

}

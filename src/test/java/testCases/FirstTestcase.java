package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestcase {

	public static void main(String[] args) {
		
		//Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		
		
		//FIX FOR: Invalid Status code=403 text=Forbidden in Selenium ChromeDriver 
		   ChromeOptions options = new ChromeOptions();
           options.addArguments("--remote-allow-origins=*");
		
		
		
		//Open browser chrome
		WebDriver driver = new ChromeDriver(options);
		
		//Implicit wait version 3
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Implicit wait version 4
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Delete Cookies 
		driver.manage().deleteAllCookies();
		
		//Fill Username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		//Fill Password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		//Click on login button
		//driver.findElement(By.id("btnLogin")).click();
		
		//Click on log in button with explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();
		
		
		
		//Page Home is displayed
		String adminUser = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(adminUser, "Bienvenido iaw0cT");
		
		//Print a log in message to the screen
		System.out.println("Successfully authentication");
		
		
		//Kill browser /Close Browser 
		//driver.close();
		driver.quit();

	}

}

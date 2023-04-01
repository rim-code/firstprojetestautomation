package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGDemo {

	public WebDriver driver;
	public WebDriverWait wait;

@BeforeMethod
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

@Test
	public void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("automation selenium");
		driver.findElement(By.name("btnK")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println("Test Completed Successful");
	}

}

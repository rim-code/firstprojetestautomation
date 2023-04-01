package testCases;

import java.time.Duration;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculatrice{

	public static void main(String[] args) {

		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://juliemr.github.io/protractor-demo/");

		// Delete Cookies
		driver.manage().deleteAllCookies();

		// Fill nombre1
		WebElement nbre1 = driver.findElement(By.xpath("//input[@ng-model='first']"));

		// Fill nombre2
		WebElement nbre2 = driver.findElement(By.xpath("//input[@ng-model='second']"));

		nbre1.sendKeys("10");

		nbre2.sendKeys("45");
		WebElement GOButton = driver.findElement(By.id("gobutton"));
		GOButton.click();

		
	WebElement resultCal = driver.findElement(By.tagName("h2"));
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      Pattern pattern = Pattern.compile("\\d+");
      wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
      System.out.println("The result is:" +resultCal.getText());

		

	}

}
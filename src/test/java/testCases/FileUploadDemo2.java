package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadDemo2 {

	public WebDriver driver;
	public WebDriverWait wait;
	private static String filePath = "C:\\Users\\Lenovo\\Desktop\\formation-Expert-Zied\\photo.jpg";

	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
@Test
	public void robotTest() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		uploadFileWithRobot(filePath);
	}
	
@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	// upload file by robot class
	public void uploadFileWithRobot(String imagPath) {
		  StringSelection stringselection = new StringSelection(imagPath);
		  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		  clipboard.setContents(stringselection, null);
		  
		  Robot robot = null;
		  try {
			  robot = new Robot();
		  }catch(AWTException e) {
			  e.printStackTrace();
		  }
		    robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		  
		  
		  
		  
	  }

}

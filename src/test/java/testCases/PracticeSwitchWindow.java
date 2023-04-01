package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://demoqa.com/browser-windows");

		// Maximize browser
		driver.manage().window().maximize();
		
		//Store And Print the Name Of the First Window
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		//Store And Print The Name Of All The Windows Open //Set pour stocker list
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		// Pass a Window Handle To Other Window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		

	}

}

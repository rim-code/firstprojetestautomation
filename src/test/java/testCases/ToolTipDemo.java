package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		
		

		//Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		
		//Open browser chrome
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTiptext = text.getText();
		
		//String toolTiptext = text.getAttribute("tooltip"); on demande m developpeur yajout attribut tooltip
		
		if(toolTiptext.equalsIgnoreCase("Hover me to see")) {
			
			System.out.println("Pass: Tooltip matching expected value");
		}
		else {
			System.out.println("Fail: Tooltip not matching expected value");
		}
		
		WebElement placeholder = driver.findElement(By.id("toolTipTextField"));
		String textplaceholder = placeholder.getAttribute("placeholder");
		System.out.println("Placeholder is :"+ textplaceholder );
		driver.quit();
	}

}

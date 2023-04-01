package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{

	public static void main(String[] args) {
		//Read chrome Driver exe
	    System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
	
	    //Open browser chrome
		WebDriver driver = new ChromeDriver();
		//Maximize browser
		 driver.manage().window().maximize();

		//Open URL
		driver.get("https://demoqa.com/droppable/");
		
		//instantiation Action class 
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(from, to).perform();
		
		//Verify Text changed into Dropped!
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("Pass: source is dropped to target as expected");
		}else {
			System.out.println("Fail: sourcecould not drapped to target as expected ");
		}
		
      driver.quit();
	}

}

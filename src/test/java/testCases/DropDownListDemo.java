package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {

		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://demoqa.com/select-menu");
		
		//Create Object of the Select  Class 
		Select dropDownList = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		// Select the Option By Index 
		 //dropDownList.selectByIndex(3);
		 
		// Select the Option By Value
		 //dropDownList.selectByValue("5");
		 
		// Select the Option By Index 
		 dropDownList.selectByVisibleText("Black");

	}

}

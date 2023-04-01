package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		
		
	//Read chrome Driver exe
	System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		
	//Open browser chrome
	WebDriver driver = new ChromeDriver();
	
	//Maximize browser
	 driver.manage().window().maximize();

	//Open URL
	driver.get("https://demo.guru99.com/test/guru99home/");
	
	//Switch To The Frame By ID
	driver.switchTo().frame("a077aa5e");  
	
	System.out.println("We are Switching to the iframe");
	
	driver.findElement(By.xpath("html/body/a/img")).click();
	
	System.out.println("We are done");
	
	//Fermer frame default content fermer tous les frame parentframe  traj3ek lel parent de frame 
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	driver.close();
	
			
	}

}

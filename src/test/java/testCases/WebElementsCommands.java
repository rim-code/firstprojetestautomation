package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) {
		// Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open browser chrome
		WebDriver driver = new ChromeDriver();

		
		// Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement element = driver.findElement(By.id("txtUsername"));
		String attValue = element.getAttribute("id");
		System.out.println("The Id attribute is : "+attValue);
		element.clear();
		
		Dimension dimensions = element.getSize();
		System.out.println("Hight : "+ dimensions.height + "Width : "+ dimensions.width);
		
		Point point = element.getLocation();
		System.out.println("X cordinate : "+ point.x + "Y cordinate : "+point.y);
		
		
		WebElement btnlogin = driver.findElement(By.id("btnLogin"));
		//Verifier si le bouton login afficher vrai/faux 
		boolean result1 = btnlogin.isDisplayed();
		System.out.println(result1);
		
		//Verifier si le bouton login activer vrai/faux
		boolean result2 = btnlogin.isEnabled();
		System.out.println(result2);
		
		//Verifier si le bouton login existe vrai /faux 
		List <WebElement> login = driver.findElements(By.id("btnLogin"));
		if(login.size() !=0) {
			System.out.println("The Login Button exist");
		}else
		{
			System.out.println("The Login Button does not exist");
		}
		driver.quit();
		
		
	}

}

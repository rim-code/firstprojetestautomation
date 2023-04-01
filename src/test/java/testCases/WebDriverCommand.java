package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		
		
		//Read chrome Driver exe
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
				
		//Open browser chrome
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		String titlePage = driver.getTitle();
		int titlelength = titlePage.length();
		
		System.out.print("Title of the page is : "+titlePage);
		System.out.print("Title length is : "+titlelength);
		
		String actualurl = driver.getCurrentUrl();
		if(actualurl.equals(url)) {
			System.out.print("Verification successfull the correct url is opened ");
		}else {
			System.out.print("Verification failed an incorrect url is opened ");
		}
		
		System.out.print("Actual url is: " + actualurl );
		System.out.print("Expected url is: " + url);
		
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		System.out.print("Length of the sourcepage is " + lengthSourcePage );
		driver.quit();
		
	}
}

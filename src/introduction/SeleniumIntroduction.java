package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {
	
	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver

		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\wisan\\OneDrive\\Documentos\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/locatorspractice/" );
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
}
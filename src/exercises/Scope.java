package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count of links present in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//count the link present in the footstep
		WebElement footstep = driver.findElement(By.id("gf-BIG"));
		System.out.println(footstep.findElements(By.tagName("gf-BIG")).size());

	}

}

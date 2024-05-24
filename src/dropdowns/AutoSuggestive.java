package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		// li[@class='ui-menu-item'] //a[@id='ui-id-43']
				List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] "));

				for (WebElement option : options) {
					if (option.getText().equals("India")) {
						option.click();
						break;
					}
				}

	}

}

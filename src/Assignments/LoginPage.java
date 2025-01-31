package Assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		login(driver);

	}

	public static void login(WebDriver driver) {
		String username = "rahulshettyacademy";
		String password = "learning";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='user']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		driver.findElement(By.xpath("//input[@wfd-id='id4']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++){
			products.get(i).click();

		}
		driver.findElement(By.partialLinkText("Checkout")).click();}


	
}

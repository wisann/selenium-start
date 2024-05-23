package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\wisan\\OneDrive\\Documentos\\chromedriver.exe");
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
	
		String name = "wisan";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//p[contains(.,'You are successfully logged in.')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(.,'You are successfully logged in.')]")).getText() ,"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name+ "," );
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}
}
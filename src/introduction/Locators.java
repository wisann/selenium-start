package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\wisan\\OneDrive\\Documentos\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/p[1]"))
				.getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		// reset the password
		driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("test");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john2@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Phone Number')]")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.err.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("wisan");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn'][contains(.,'Sign In')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}

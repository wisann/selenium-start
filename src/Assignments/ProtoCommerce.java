package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProtoCommerce {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String name = "wisan";
		String email = "wisan@gmail.com.br";
		String password = "1234567";
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//option[.='Female']")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("10072003");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
	}
}

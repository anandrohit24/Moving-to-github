package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Git {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		 driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test(priority=1)
	void fail()
	{
		driver.findElement(By.id("username")).sendKeys("st");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		WebElement e= driver.findElement(By.xpath("//div[@id='error']"));
		System.out.println(e.getText());
	}
	@Test(priority=2)
	void first()
	{
		driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.id("submit")).click();
	}
	@AfterClass
	void tra()
	{
		driver.quit();
	}
}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void SetUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Hemantamechanical@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("HemantapASSWORD");
		/*
		 * 
		 * Added line new comments
		 * 
		 */
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}

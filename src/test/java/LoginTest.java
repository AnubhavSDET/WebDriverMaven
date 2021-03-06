import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin() throws InterruptedException{
		driver.get("https://stackoverflow.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("anubhav.jain@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("anubhav@123");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@AfterSuite
	public void tearDown() {
	 driver.close();
	}
}
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
	public void doLogin(){
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("anubhav.jain@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("anubhav@123");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
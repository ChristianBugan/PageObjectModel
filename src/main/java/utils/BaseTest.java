package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public BasePage app;
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();//face maximize la browser.
		
		driver.get("https://keybooks.ro/");
		
		app = new BasePage();
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(4000); // BAD PRACTICE - aduci timpi morti
		//driver.close(); // inchide tabul curent
		driver.quit(); // inchide browserul indiferent de cate taburi are deschise.
	}
	
}

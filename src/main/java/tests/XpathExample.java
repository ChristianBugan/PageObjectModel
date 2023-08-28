package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseTest;

public class XpathExample extends BaseTest {

	@Test(priority=1)
	public void xpathExample() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		// WebElement: <li class="menu_user_login">
		// CSS selector --> li[class='menu_user_login']
		// XPATH selector --> //li[@class='menu_user_login']
		
		WebElement loginLink = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", loginLink);
		loginLink.click();
		
		//multiple elements
		//plec de la tagname  <li> si sar in jos multiple elemente pana gasesc <input. .>
		// EX: //li//input[@name='log']
		
		WebElement username = driver.findElement(By.xpath("//li//input[@name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", username);
		username.sendKeys("TestUser");
		
		//conditional operator OR
		//--> //li//input[@id='password' or @type='password' or @name='pwd']
		
		WebElement pass = driver.findElement(By.xpath("//li//input[@id='password' or @type='password' or @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", pass);
		pass.sendKeys("12345@67890");
		
		//conditional operator AND
		// --> //li//input[@class='submit_button' and @value='Login']
		
		WebElement submit = driver.findElement(By.xpath("//li//input[@class='submit_button' and @value='Login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", submit);
		submit.click();
		
	}
	
	@Test(priority=2)
	public void xpathExample2() throws InterruptedException {
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='user_name']")));
	
		WebElement user = driver.findElement(By.xpath("//span[@class='user_name']"));
		Actions action =  new Actions(driver);
		action.moveToElement(user).perform();
		
		//Exemplu CONTAINS ()
		//Webelement:
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		//Accesare pe baza de contains atribute
		
		//CSS 
		//     --> a[href*='profile.php']
		//steluta e CONTAINS
		
		//vs
		
		//Xpath
		//      --> //a[contains(@href, 'profile.php' )]
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[contains(@href, 'profile.php' )]")).click();
		
		Thread.sleep(1000);
		
		//WebElement  : <a href="https://keybooks.ro/account/orders/">recent orders</a>
		
		
		// --> //a[contains(text(), 'orde')]
		driver.findElement(By.xpath("//a[contains(text(), 'orde')]")).click();
		
		//	//th[contains(@class, 'woocommerce-orders-table__header' )]/span[contains(text(), 'Order')]	
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement orderTableHeader = driver.findElement(
				By.xpath("//th[contains(@class, 'woocommerce-orders-table__header' )]/span[contains(text(), 'Order')]"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", orderTableHeader);
		
		
		//index based
		// --> (//th[contains(@class, 'woocommerce-orders-table__header')]/span)[4]
		
		WebElement totalTableHeader = driver.findElement(
				By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[4]"));
				
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", totalTableHeader);
		
		// //td[contains(@class, 'woocommerce-orders-table__cell' )][@data-title='Order']/a[contains(text(), '1720')]
		
		WebElement order1720 = driver.findElement(
				By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell' )][@data-title='Order']/a[contains(text(), '1720')]"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", order1720);
		
		// FUNCTIA NOT 
		
		// //td[contains(@class, 'woocommerce-orders-table__cell' )][@data-title='Order']/a[not(contains(text(), '1720'))]
		
		List<WebElement> orders = driver.findElements(
				By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell' )][@data-title='Order']/a[not(contains(text(), '1720'))]"));
		
		for(WebElement element : orders) {
			jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid red')", element);
		}
		
			
		
	}
	
}

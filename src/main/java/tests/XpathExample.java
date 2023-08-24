package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;

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
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='user_name']")).click();
	
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
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href, 'profile.php' )]")).click();
		
		//WebElement  : <a href="https://keybooks.ro/account/orders/">recent orders</a>
		
		
		
		// --> //a[contains(text(), 'orde')]
		driver.findElement(By.xpath("//a[contains(text(), 'orde')]")).click();
		
	}
	
}

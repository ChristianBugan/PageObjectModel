package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;

import utils.BaseTest;

public class XpathExample2 extends BaseTest {
	
	@Test
	public void xpathExample() {
		
		//parent
		// -> //a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		WebElement loginMenu = driver.findElement(
				By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid red')", loginMenu);
		
		loginMenu.click();
		
		//descendant & child
		// toate xpathurile de mai jos fac aceleasi lucruri:
		
		// //ul[@id='menu_user']//div[contains(@class, 'login_field')]/input[@id='log']
		// //ul[@id='menu_user']//input[@id='log']
		
		// //ul[@id='menu_user']/descendant::form[contains(@class,'login_form')]/child::div[contains(@class, 'login_field')]/child::input
		
		
		WebElement usernameField = driver.findElement
				(
					By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class,'login_form')]/child::div[contains(@class, 'login_field')]/child::input"));
		usernameField.sendKeys("TestUser");
		
		//descendant
		WebElement passwordField = driver.findElement(By.xpath("//ul/descendant::input[@id='password']"));
		passwordField.sendKeys("12345@67890");
		
		//following sibling --> coboara pe urmatorul frate
		// //ul//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input
		
		WebElement rememberMe = driver.findElement(
				By.xpath("//ul//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input"));
		rememberMe.click();
		
		// preceding-sibling --> URCA pe urmatorul frate.
		// //ul//div[contains(@class, 'remember_field')]/preceding-sibling::div[contains(@class, 'login_field')]
		
		
		//following --> coboara in dom fara a avea nevoie de o relatie de rudenie
		//preceding --> URCA in dom fara a avea nevoie de o relatie de rudenie
		
		// //div[@class='top_panel_middle']/preceding::input[@class='submit_button']
		
		WebElement submitButton = driver.findElement(
				By.xpath("//div[@class='top_panel_middle']/preceding::input[@class='submit_button']"));
		submitButton.click();
		
		
		
		
		
		
	}
	

}

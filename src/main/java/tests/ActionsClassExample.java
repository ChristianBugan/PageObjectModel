package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class ActionsClassExample extends BaseTest {

	//@Test(priority=1)
	public void hoverExample() {
		
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.aboutLink);
		menu.hoverElement(menu.blogLink);
		menu.navigateTo(menu.shopLink);
		
		
	}
	
	//@Test(priority=2)
	public void dragAndDropExample() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,600)");
		
		ShopPage shop = new ShopPage(driver);
		//shop.dragAndDropSlider(shop.priceSliderInitialPosition, 100, 0);
		shop.dragAndDropSlider(shop.priceSliderFinalPosition, -100, 0);
		shop.dragAndDropElement(shop.priceSliderInitialPosition, shop.priceSliderFinalMoved);
		
		Thread.sleep(1000);
	}
	
	//@Test
	//scroll blind exemplu
	public void actionScroll() throws InterruptedException {
		Actions action = new Actions(driver);
		
		action.scrollByAmount(0, 2000).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -2000).perform();
		Thread.sleep(2000);	
	}
	
	//@Test(priority=1)
	public void sendKeysExample() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		ContactsPage contacts = new ContactsPage(driver);
		contacts.sendKeysWithCaps(contacts.nameField, "CristiTestKey");
		Thread.sleep(3000);
	}
	
	//@Test
	public void sendKeysExample2() throws InterruptedException {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		
		ContactsPage contacts =  new ContactsPage(driver);
		WebElement element = driver.findElement(contacts.nameField);
		
		Thread.sleep(2000);
		
		Actions action =  new Actions(driver);
		action.
			moveToElement(element).
			sendKeys(element, "Name").
			pause(Duration.ofSeconds(2)).
			sendKeys(Keys.TAB, "email@email.com").
			pause(Duration.ofSeconds(2)).
			sendKeys(Keys.TAB, "Cristiiii subject").
			pause(Duration.ofSeconds(2)).
			sendKeys(Keys.TAB, "Cristi message").
			sendKeys(Keys.TAB, Keys.ENTER).
			perform();		
		
		Thread.sleep(1000);
	}
		
	@Test
	public void copyPasteExample() {
		
		//MenuPage menu = new MenuPage(driver);
		app.menu.navigateTo(app.menu.loginLink);
		
		
		//LoginPage login = new LoginPage(driver);
		WebElement username = driver.findElement(app.login.usernameField);
		username.sendKeys("TestCristiUser");
		
		Actions action = new Actions(driver);
		
		//selectez textul pe care vreau sa il copiez
		
		
		//if else / operator ternar
		Keys ctrlKey = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		
		//selectie pe text cu CTRL+A
		
		action.
			keyDown(ctrlKey).
			sendKeys("a").
			keyUp(Keys.CONTROL).
			perform();
		
		
		WebElement password = driver.findElement(app.login.passwordField);
		
		action.
		keyDown(ctrlKey).
		sendKeys("c").
		keyUp(Keys.CONTROL).
		perform();
	

		action.moveToElement(password).
		click().
		pause(Duration.ofSeconds(2)).
		keyDown(ctrlKey).
		sendKeys("v").
		keyUp(ctrlKey).
		pause(Duration.ofSeconds(2)).
		perform();
		
		System.out.println(password.getAttribute("value"));
		
	}
	
	
	
	
	
}

package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest {
	
	//@Test(priority=1)
	public void selectByValueTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByValue("price-desc");
		
		Thread.sleep(1000);
		
		assertEquals(shop.getSelectedOption(), "Sort by price: high to low");
	}

	//@Test(priority=2)
	public void selectByVisibleTextTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByVisibleText("Sort by popularity");
		
		Thread.sleep(1000);
		
		assertEquals(shop.getSelectedOption(), "Sort by popularity");
		
	}
	
	@Test(priority=3)
	public void selectByIndexTest() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		Thread.sleep(2000);
		
		ShopPage shop = new ShopPage(driver);
		shop.selectByIndex(3);
		
		Thread.sleep(1000);
		
		assertEquals(shop.getSelectedOption(), "Sort by latest");
		
	}
	
	//@Test(priority=4)
	public void exampleStaleElementException() {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		//identific webelement cu nume dropdown pe current browser Firefox
		// cu session ID xx
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(2); // merge fara probleme
		// aici se intampla un refresh;
		//dupa refresh Selenium isi ia alt session ID si pica.
		//foloseste element, dar Selenium nu il mai poate asocia cu noul sessionID
		//El asociaza elementul cu vechiul sessionID
		// si arunca exceptie StaleElement 
		
		dropdown = driver.findElement(By.name("orderby"));
		select = new Select(dropdown);
		select.selectByVisibleText("Sort by latest");
	}
	
	
	
}

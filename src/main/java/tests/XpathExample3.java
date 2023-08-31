package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MenuPage;

import utils.BaseTest;

public class XpathExample3 extends BaseTest {

	@Test
	public void xpathExample() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		// --> //bdi[contains(text(), '20.55')]
		
		//xpath cu referinta la textul cautat in cazul nostru 20.55
		
		// --> //span[@class='price']/span[bdi='$14.99']
		
		//scroll down 1200 pixels
		jse.executeScript("window.scrollBy(0,1200)");
		
		
		WebElement price14_99 = driver.findElement
				(By.xpath("//span[@class='price']/span[bdi='$14.99']"));
		
		//scroll to element
			//	jse.executeScript("arguments[0].scrollIntoView()", price14_99);
					
		jse.executeScript
			("arguments[0].setAttribute('style', 'background: orange;border:4px solid red')", price14_99);
		
		// --> //bdi[contains(text(), '10.35')]/../../../del/child::*/bdi
		// .. -> merge inapoi un nivel - urca pe parinte
		
		WebElement price11_50 = driver.findElement
				(By.xpath("//bdi[contains(text(), '10.35')]/../../../del/child::*/bdi"));
		
		jse.executeScript
		("arguments[0].setAttribute('style', 'background: orange;border:4px solid red')", price11_50);
	
	}
	
	
	
	
}

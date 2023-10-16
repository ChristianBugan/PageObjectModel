package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.DataProviderClass;

public class DataProviderBooksURLTest extends BaseTest{

	
	@Test(dataProviderClass = DataProviderClass.class , dataProvider ="booksURLDataProvider")
	public void testBooksURL(String numeCarte, String urlCarte) throws InterruptedException {
		
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(), '"+numeCarte+"')]"));
		//element.click();
		
		app.menu.click(By.xpath("//a[contains(text(), '"+numeCarte+"')]"));
		Thread.sleep(2000);
		
		assertEquals(driver.getCurrentUrl(), urlCarte);
		
		app.click(app.menu.homeLink);
		
		
		 // a[href='the-forest']
		// The forest
		// <a href="the-forest">The forest</a>
		// a[contains(text(), "The forest") ]
		
	}


}

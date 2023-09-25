package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework24ShopPageVerifyTest extends BaseTest {

	@Test
	public void testStormBookElements() throws InterruptedException {
		
		app.click(app.homePage.stormBooklink);
		
		//driver.findElement(By.cssSelector("a[href='storm']")).click();
		//Thread.sleep(2000);
		
		assertTrue(app.verifyIsDisplayed(app.stormBook.stormPrice));
		
		
	}
	
	
	
	
}

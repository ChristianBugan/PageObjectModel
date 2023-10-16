package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class KingBookTestHomework33 extends BaseTest {

	@Test
	public void kingBookTest () {
		
		app.click(app.menu.searchIcon);
		app.sendKeys(app.menu.searchInput, "king");
		app.click(By.xpath("(//a[contains(@href, 'the-wicked-king')])[1]"));
		
		assertEquals(app.returnElement(app.bookTemplate.categories).getText(), "New releases");
		
	}
	
	
}

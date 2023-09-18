package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest {
	
	//@Test
	public void example1() {
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//navigate to URL
		
		//driver.get("<URL>");
		//driver.navigate().to("<URL>");
		
		jse.executeScript("window.location='http://emag.ro'");
		
		//driver.navigate().back();
		jse.executeScript("window.history.go(-1)");
		
		//driver.navigate().forward();
		jse.executeScript("window.history.forward");
		
		//1
		driver.navigate().refresh();
		
		//2
		jse.executeScript("window.history.go(0)");
		
		//3
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
		//4
		driver.get(driver.getCurrentUrl());
		
	}
	
	@Test
	public void example2() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		
		//alternativa pentru click()
		jse.executeScript("arguments[0].click()", searchIcon);
		
		WebElement searchInput = driver.findElement(app.menu.searchInput);
		
		//alternativa pentru sendkeys()
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		jse.executeScript("arguments[0].click()", searchIcon);
		
		
		//jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
		//jse.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchIcon));
		//jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
		
		//Dragos mai baga o fisa la selenium wrappers si logica pt care am creat return element() de mai sus.
		
		
	}
	

}

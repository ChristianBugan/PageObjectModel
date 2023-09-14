package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	//Va contine locatori sau webelements
	//WebElement button = driver.findElement(By.ceva(""));
	
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");
	public By singleAuthorLink = By.linkText("Single author");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By eventsLink = By.linkText("EVENTS");
	
	
	// Si va contine metode specifice cu locatorii sau elementele de mai sus
	// metode specifice = functionalitate a paginii in care ma aflu;
	
	
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();	
		//adaugi perform la finalul chain-ului de actions sa functioneze
		
		
	}
	
	
}

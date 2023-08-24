package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	// Si va contine metode specifice cu locatorii sau elementele de mai sus
	// metode specifice = functionalitate a paginii in care ma aflu;
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
}

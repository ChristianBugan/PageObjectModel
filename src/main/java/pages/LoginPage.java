package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//locatori aici
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.cssSelector("li input[value='Login']");
	public By errorLoginPopup = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By successLoginPopup = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By logoutButton = By.linkText("Logout");
		
	//metode specifice
	public void loginInApp(String user,String pass) {
		driver.findElement(usernameField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}
	
	public boolean checkLoginMessageIsDisplayed(By Locator) {
		return driver.findElement(Locator).isDisplayed();
		
	}
	
	public void logoutFromApp() {
		driver.findElement(logoutButton).click();
		
	}
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostFormatsPage extends SeleniumWrappers {

public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By galleryFormatLink = By.xpath("//a[contains(text(), 'Gallery Format') ]");
	
	
}

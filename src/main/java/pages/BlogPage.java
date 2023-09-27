package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers{

	public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	
	
    // sectiunea postFormats din lista afista de la blog "
		public By postFormats = By.xpath("//li[@id='menu-item-232']");
		
	//POST formats link page - AUDIO FORMATS 
		public By audioPostLink = By.xpath("//a[text()='Audio post']");
		
		
	
}
	



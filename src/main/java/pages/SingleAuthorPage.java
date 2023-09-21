package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class SingleAuthorPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori din page SingleAuthorPage
	
	
	//locatori pentru procentele afisate.
	public By dramaPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[1]");
	public By biographyPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[2]");
	public By cookbooksPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[3]");

	
}

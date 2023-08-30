package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleAuthorPage {
	
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori din page SingleAuthorPage
	
	
	//locatori pentru procentele afisate.
	public By dramaPercentage = By.xpath("//div[@class='sc_skills_total' and @data-ed='%' and text()='95%']");
	public By biographyPercentage = By.xpath("//div[@class='sc_skills_total' and @data-ed='%' and text()='75%']");
	public By cookbooksPercentage = By.xpath("//div[@class='sc_skills_total' and @data-ed='%' and text()='82%']");

	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;
import utils.SeleniumWrappers;

public class StormBookPage extends SeleniumWrappers{

	public WebDriver driver;
	
	public StormBookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locatori
	

	    // TITTLU CARTII "STORM"
		public By stormTitle = By.xpath("//h1[@class='product_title entry-title']");
		
		//PRETUL CARTII "STORM"
		public By stormPrice = By.xpath("//*[@id=\"product-256\"]/div[2]/p/span/bdi"); // to be refactored?
		
		//Semnul de LUPA/zoom/ de la cartea "STORM"
		public By stormZoom = By.xpath("(//a[@class='woocommerce-product-gallery__trigger'])[1]");
		
		//descrierea cartii "STORM"
		public By stormDescription = By.xpath("//p[contains(text(), 'This delightful book')]/text()[1]");
		
		//categoria cartii "STORM"
		public By stormCategory = By.xpath("//span[@class='posted_in']");
	
}

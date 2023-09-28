package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{

	public WebDriver driver;
	
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locatori
	
	public By playButton = By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[1]");
	
	
	
	//public By songSliderInitialPosition = By.xpath("//*[@id=\"mep_0\"]/div/div[3]/div[3]/span");
	public By songSliderInitialPosition = By.cssSelector("span[class*=mejs-time-total]");
	
	// //a[@class='mejs-horizontal-volume-slider']
	public By volumeSliderInitialPosition = By.xpath("//a[@class='mejs-horizontal-volume-slider']");
}

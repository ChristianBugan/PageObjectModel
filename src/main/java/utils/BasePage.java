package utils;

import pages.*;
import tests.Homework24ShopPageVerifyTest;

public class BasePage extends SeleniumWrappers {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	public EventsPage events = new EventsPage(driver);
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	
	
	public SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
	
	public ShippingAddressPage shippingPage = new ShippingAddressPage(driver);
	
	public StormBookPage stormBook = new StormBookPage(driver);
	
	public HomePage homePage = new HomePage(driver);
	
	public BlogPage blogPage = new BlogPage(driver);
	
	public AudioPostPage audioPost = new AudioPostPage(driver);
	

}

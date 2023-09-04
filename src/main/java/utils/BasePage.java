package utils;

import pages.MenuPage;
import pages.LoginPage;
import pages.ShopPage;
import pages.ContactsPage;

public class BasePage extends BaseTest {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	
	
}

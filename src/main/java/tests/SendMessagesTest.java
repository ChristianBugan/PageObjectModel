package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ContactsPage;
import utils.BaseTest;

public class SendMessagesTest extends BaseTest {

	@Test(priority=1)
	public void sendMessageText() {
		
		
		//String timestamp = new SimpleDateFormat("yyyy.MM.HH.mm.ss.sss").format(new Date());
		//System.out.println(timestamp);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		ContactsPage contactsPage = new ContactsPage(driver);
		contactsPage.sendMessage("Test", "abc@test.test", "My subject", "My message");
		//String timestamp2 = new SimpleDateFormat("yyyy.MM.HH.mm.ss.sss").format(new Date());
		//System.out.println(timestamp2);
		
		
		
	}
	
	@Test(priority=2)
	public void refactorSendMessageText() {
		
		//String timestamp = new SimpleDateFormat("yyyy.MM.HH.mm.ss.sss").format(new Date());
		//System.out.println(timestamp);
		app.click(app.menu.contactLink);
		app.contact.refactorSendMessage("Test", "abc@test.test", "My subject", "My message");
		//String timestamp2 = new SimpleDateFormat("yyyy.MM.HH.mm.ss.sss").format(new Date());
		//System.out.println(timestamp2);
		
		
	}
	
}

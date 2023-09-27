package tests;

import org.testng.annotations.Test;

import pages.AudioPostPage;
import utils.BaseTest;

public class Homework25BlogPageTest extends BaseTest {

	@Test
	public void testAudioPostSlider() throws InterruptedException {
		
		app.click(app.menu.blogLink);
		
		app.click(app.blogPage.postFormats);
		 
		app.scrollVertically(1000); 
		 
		app.click(app.blogPage.audioPostLink);
		
		app.click(app.audioPost.playButton);
		
		Thread.sleep(3000);
		
		app.draggingAndDropppingSlider(app.audioPost.songSliderInitialPosition, 200, 0);
		
		app.draggingAndDropppingSlider(app.audioPost.volumeSliderInitialPosition, 50, 0);
		
	}
	
}

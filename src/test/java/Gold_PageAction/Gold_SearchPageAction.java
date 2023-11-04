package Gold_PageAction;

import org.testng.Assert;

import Gold_PageLocator.Gold_SearchPageLocator;
import Gold_Utility.Gold_Base;

public class Gold_SearchPageAction extends Gold_Base {

	Gold_SearchPageLocator gold_SearchPageLocator = new Gold_SearchPageLocator();
	
	public void Verifyusercansearchitem() throws Exception {
	Thread.sleep(3000);
	boolean veri = gold_SearchPageLocator.Verify.isDisplayed();
	Assert.assertTrue(veri);	
	}
	
	
	public void Verifyuserinlaptopcomputerpage() throws Exception {
	Thread.sleep(3000);	
	boolean verif = gold_SearchPageLocator.veLapPa.isDisplayed();	
	Assert.assertTrue(verif);
	}
	
	public void clickonitem() {
	gold_SearchPageLocator.clonitem.click();	
		
	}
	
	public void clickaddtocart() {
		gold_SearchPageLocator.clAddToCart.click();	
		
	}
	
	
}

package Gold_PageAction;

import org.testng.Assert;

import Gold_PageLocator.Gold_CartPageLocator;
import Gold_Utility.Gold_Base;

public class Gold_CartPageAction extends Gold_Base{

	Gold_CartPageLocator gold_CartPageLocator = new Gold_CartPageLocator();
	
	public void Verifyusercanadditemincartpage() throws Exception {
	Thread.sleep(3000);
    boolean verify	= gold_CartPageLocator.verifyCP.isDisplayed();
	Assert.assertTrue(verify);
		
	}
}

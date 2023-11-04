package Gold_PageAction;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Gold_PageLocator.Gold_HomePageLocator;
import Gold_Utility.Gold_Base;
import Gold_Utility.Gold_TestData;

public class Gold_HomePageAction extends Gold_Base {

	Gold_HomePageLocator gold_HomePageLocator = new Gold_HomePageLocator();
	
	public void typelaptopinsearchfield() {
		gold_HomePageLocator.searchField.sendKeys(Gold_TestData.send);
		
		
	}
	
	public void clicksearchbutton() {
		gold_HomePageLocator.clSearch.click();	
		
		
	}
	
	public void mousehoveroncomputerandaccessories() {
		Actions ac = new Actions(driver);
		ac.moveToElement(gold_HomePageLocator.mhCA).build().perform();
		
		
	}
	
	public void mousehoveronlaptops() {
		Actions act = new Actions(driver);
		act.moveToElement(gold_HomePageLocator.mhLP).build().perform();
		
		
	}
	
	public void clickviewalllaptops() {
		gold_HomePageLocator.clVAL.click();
		
	}
	public void Verifyusercanscrolldownseeparticularitemandscrollup() throws Exception {
		
	((JavascriptExecutor)driver).executeScript("scroll(0,3000)");	
		
		
	Thread.sleep(3000);	
	boolean verify	= gold_HomePageLocator.scrlDandVeri.isDisplayed();
	Assert.assertTrue(verify);	
	Thread.sleep(3000);	
	((JavascriptExecutor)driver).executeScript("scroll(0,-3000)");
	Thread.sleep(3000);
		
	}
}

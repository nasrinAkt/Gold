package Gold_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Gold_Utility.Gold_Base;

public class Gold_CartPageLocator extends Gold_Base{

	public  Gold_CartPageLocator() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath ="(//div[@class='pull-right cf-button-margin'])[1]")
	public WebElement verifyCP;
	
}

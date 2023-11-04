package Gold_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Gold_Utility.Gold_Base;

public class Gold_HomePageLocator extends Gold_Base{

	public  Gold_HomePageLocator() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="mh-search-input")
	public WebElement searchField;
	
	@FindBy(xpath ="//button[@class='mh-search-btn mh-search-submit']")
	public WebElement clSearch;
	
	
	@FindBy(xpath ="//span[text()='Computers & Accessories']")
	public WebElement mhCA;
	
	@FindBy(xpath ="//button[text()='Laptops']")
	public WebElement mhLP;
	
	@FindBy(linkText ="View All Laptops")
	public WebElement clVAL;
	
	@FindBy(xpath ="//h2[@id='dellsupport']")
	public WebElement scrlDandVeri;
	
	
	
}

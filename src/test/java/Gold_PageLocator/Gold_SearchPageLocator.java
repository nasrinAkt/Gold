package Gold_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Gold_Utility.Gold_Base;

public class Gold_SearchPageLocator extends Gold_Base{

	public  Gold_SearchPageLocator() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath ="//span[text()='Laptops & 2-in-1 PCs']")
	public WebElement Verify;
	
	@FindBy(xpath ="//h1[text()='Laptop Computers & 2-in-1 PCs']")
	public WebElement veLapPa;
	
	@FindBy(linkText ="Inspiron 15 Laptop")
	public WebElement clonitem;
	
	@FindBy(css ="div[data-bind='html: purchasePathSubNav'] button[class='btn btn-success dellmetrics-browseconfig atc-cta-mfe rounded-sm text-nowrap']" )
	public WebElement clAddToCart;
}

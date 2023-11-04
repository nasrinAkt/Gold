package Gold_StepDefinition;

import Gold_PageAction.Gold_CartPageAction;
import Gold_PageAction.Gold_HomePageAction;
import Gold_PageAction.Gold_SearchPageAction;
import Gold_Utility.Gold_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Gold_Search extends Gold_Base{
	Gold_HomePageAction gold_HomePageAction = new Gold_HomePageAction();
	Gold_SearchPageAction gold_SearchPageAction = new Gold_SearchPageAction();
	Gold_CartPageAction gold_CartPageAction = new Gold_CartPageAction();
	
	@Given("^open <\"([^\"]*)\"> go$")
	public void open_go(String URL) throws Throwable {
		GoLaunchURL(URL);
	}

	@Then("^type laptop in search field$")
	public void type_laptop_in_search_field() throws Throwable {
		gold_HomePageAction.typelaptopinsearchfield(); 
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		gold_HomePageAction.clicksearchbutton(); 
	}

	@Then("^click on item$")
	public void click_on_item() throws Throwable {
		gold_SearchPageAction.clickonitem();
	    
	}

	@Then("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		gold_SearchPageAction.clickaddtocart(); 
	}

	@Then("^Verify user can add item in cart page$")
	public void verify_user_can_add_item_in_cart_page() throws Throwable {
		gold_CartPageAction.Verifyusercanadditemincartpage();
	}




	
	
	
}

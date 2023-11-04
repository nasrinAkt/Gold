package Gold_StepDefinition;

import Gold_PageAction.Gold_HomePageAction;
import Gold_PageAction.Gold_SearchPageAction;
import Gold_Utility.Gold_Base;
import cucumber.api.java.en.Then;

public class Gold_Mhover extends Gold_Base {

	Gold_HomePageAction gold_HomePageAction = new Gold_HomePageAction();
	Gold_SearchPageAction gold_SearchPageAction = new Gold_SearchPageAction();
	
	@Then("^mouse hover on computer and accessories$")
	public void mouse_hover_on_computer_and_accessories() throws Throwable {
		gold_HomePageAction.mousehoveroncomputerandaccessories();
		
	}

	@Then("^mouse hover on laptops$")
	public void mouse_hover_on_laptops() throws Throwable {
		gold_HomePageAction.mousehoveronlaptops();
		
	}

	@Then("^click view all laptops$")
	public void click_view_all_laptops() throws Throwable {
		gold_HomePageAction.clickviewalllaptops(); 
		
	}

	@Then("^Verify user in laptop computer page$")
	public void verify_user_in_laptop_computer_page() throws Throwable {
		gold_SearchPageAction.Verifyuserinlaptopcomputerpage();
		
		
	}


	
	
}

package Gold_StepDefinition;

import Gold_PageAction.Gold_HomePageAction;
import Gold_Utility.Gold_Base;
import cucumber.api.java.en.Then;

public class Gold_ScrollUpDown extends Gold_Base{
	Gold_HomePageAction gold_HomePageAction = new Gold_HomePageAction();
	
	@Then("^Verify user can scroll down see particular item and scroll up$")
	public void verify_user_can_scroll_down_see_particular_item_and_scroll_up() throws Throwable {
	   
	    
		gold_HomePageAction.Verifyusercanscrolldownseeparticularitemandscrollup();
		
		
	}

	
	
}

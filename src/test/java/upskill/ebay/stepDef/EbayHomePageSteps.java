package upskill.ebay.stepDef;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;
import upskill.utilities.SetupDrivers;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPants();
	}
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirts();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchItems(items);

	}
	
	@Given("^User type Starwars in Search text box$")
	public void user_type_Starwars_in_Search_text_box() throws Throwable {
		EbayHomePageActionsObj.searchStarwars();
	}
	
	@When("^Select Book from Category dropdown$")
	public void select_Book_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsObj.categoryDropdown();
	}
	
	@When("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		EbayHomePageActionsObj.clickSearch();
	}
	

	@Given("^User type Billie in Search text box$")
	public void user_type_Billie_in_Search_text_box() throws Throwable {
		EbayHomePageActionsObj.searchKeyword("Billie");
	}
	
	@When("^Select Music from Category dropdown$")
	public void select_Music_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsObj.categoryDropdown("Music");

	}
	
	@Given("^User type Hawaii in Search text box$")
	public void user_type_Hawaii_in_Search_text_box() throws Throwable {
		EbayHomePageActionsObj.searchKeyword("Hawaii");
	}

	@When("^Select Travel from Category dropdown$")
	public void select_Travel_from_Category_dropdown() throws Throwable {
		EbayHomePageActionsObj.categoryDropdown("Travel");
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomePageActionsObj.mouseHoverEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsObj.clickSummary();
	}
}
package stepdef;

import functions.Validation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category extends Validation{
	
	@When("user clicks on shop by category")
	public void user_clicks_on_shop_by_category() {
		viewallCategory();
	}

	@Then("check {string} text is displayed")
	public void check_text_is_displayed(String categorypageheadertext) {
		validateviewallcategoryPage(categorypageheadertext);
	}



	
	@Then("user should see {string} under {string}")
	public void user_should_see_under(String itemname, String categoryname) {
		validateitemincategoryPage(itemname , categoryname);
	}

}

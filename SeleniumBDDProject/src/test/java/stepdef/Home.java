package stepdef;

import functions.Validation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home extends Validation {
	

	@Given("user is in home page of Bigbasket website")
	public void user_is_in_home_page_of_bigbasket_website() {
		homePage();

	}
	
	@When("user clicks on Signup")
	public void user_clicks_on_signup() {
		loginOption();

	}
	
	@Then("user should see login popup with facebook icon")
	public void user_should_see_login_popup_with_facebook_icon() {
		validateloginfacebookOption();
	}	

	@When("user clicks on MyBasket")
	public void user_clicks_on_my_basket() {
		myBasket();

	}
	@Then("user should see text as {string}")
	public void user_should_see_text_as(String mybasketmessage) {
		validatemybasketMessage(mybasketmessage);
	}

	@When("user scrolls down the page")
	public void user_scrolls_down_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user should see {string} as a category")
	public void user_should_see_as_a_category(String categoryname) {
		validatehomepageItems(categoryname);
	}

	@When("user clicks on {string} under {string}")
	public void user_clicks_on_under(String string, String categoryname) {
		productoptionsStaples(categoryname);
	}
	@Then("user should see product details with product name {string}")
	public void user_should_see_product_details_with_product_name(String itemname) {
		validateitemDetail(itemname);
	}













}

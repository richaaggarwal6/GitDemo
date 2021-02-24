package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_Landing() {
		System.out.println("landing");
		// code for user to navigate to net banking landing page
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		System.out.println("login");
		// code for user to enter username and password and click on submit
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("homepage assert/validated");
	}

	@And("Cards are displayed are {string}")
	public void cards_are_displayed(String isCardDisplayed) throws Throwable {
		System.out.println("card display is asserted: " + isCardDisplayed);
	}
}

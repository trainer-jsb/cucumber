package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("User is on the login page");
	}

	@When("^user logins to the application with valid username and password$")
	public void user_logins_to_the_application_with_valid_username_and_password() {
		System.out.println("user logins to the application with valid username and password");
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}

	@And("^logout link is displayed$")
	public void logout_link_is_displayed() {
		System.out.println("Logout link is displayed");
	}
	
	@When("^user logins to the application with \"([^\"]*)\" username and \"([^\"]*)\" password$")
    public void user_logins_to_the_application_with_something_username_and_something_password(String strArg1, String strArg2)  {
        System.out.println("User tried logging in with " +strArg1+ " and password " +strArg2);
    }

    @Then("^an error message is displayed$")
    public void an_error_message_is_displayed() throws Throwable {
        System.out.println("Error message is thrown");
    }
}
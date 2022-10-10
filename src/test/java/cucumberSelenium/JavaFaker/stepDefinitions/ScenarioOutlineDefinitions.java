package cucumberSelenium.JavaFaker.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineDefinitions {

        @Given("^user on web \"([^\"]*)\"$")
    public void user_on_web(String arg1) throws Throwable {


    }

        @Then("^user should see header logo apple$")
        public void user_should_see_header_logo_apple() throws Throwable {


            

        }

    @When("^user input field \"([^\"]*)\" with following credentials first name$")
    public void user_input_field_with_following_credentials_first_name(String firstName) {
        System.out.println("User input " + firstName);
    }

    @When("^user input field \"([^\"]*)\" with following credentials last name$")
    public void user_input_field_with_following_credentials_last_name(String lastName) {
        System.out.println("User input " + lastName);

    }

    @When("^user input field \"([^\"]*)\" with following credentials email address$")
    public void user_input_field_with_following_credentials_email_address(String emailAddress) {
        System.out.println("User input " + emailAddress);
    }

    @When("^user input field \"([^\"]*)\" with following credentials username$")
    public void user_input_field_with_following_credentials_username(String userName) {
        System.out.println("User input " + userName);
    }

    @When("^user input field \"([^\"]*)\" with following credentials password$")
    public void user_input_field_with_following_credentials_password(String password) {
        System.out.println("User input " + password);
    }

    @When("^user input field \"([^\"]*)\" with following credentials bio$")
    public void user_input_field_with_following_credentials_bio(String bio) {
        System.out.println("User input " + bio);
    }

}

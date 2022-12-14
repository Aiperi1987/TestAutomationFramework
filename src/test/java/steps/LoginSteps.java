package steps;

import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;
import com.talentlms.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {


    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.gerProperty("qaEnv"));
    }

    @Given("Enter {string} in userName or Email input field")
    public void enter_in_user_name_or_email_input_field(String userNameOrEmail) {
        loginPage.inputUserNameOrEmail(userNameOrEmail);
    }
    @Given("Enter {string} in password input field")
    public void enter_in_password_input_field(String password) {
        loginPage.inputPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickButton();
    }

    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Home",helper.getText(adminHomePage.adminHomeTitle));
    }

}



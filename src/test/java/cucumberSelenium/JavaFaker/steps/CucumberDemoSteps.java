package cucumberSelenium.JavaFaker.steps;

import cucumberSelenium.JavaFaker.digitalnomads.Bank;
import cucumberSelenium.JavaFaker.digitalnomads.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CucumberDemoSteps {

    DemirBank atayDemirAcc;
    DemirBank aibek;

    {
        try {
            atayDemirAcc = new DemirBank(111111111111L, 888888888L);
            aibek = new DemirBank(111111561111L, 889088888L);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Given("User is Logged in to Demir account")
    public void user_is_logged_in_to_demir_account() {
        System.out.println("User is logged in");;
    }
    @When("User deposit ${int} to Atay")
    public void user_deposit_$_to_atay(Integer amount) {

    }
    @Then("Atay should have ${double} in balance")
    public void atay_should_have_$_in_balance( Double expectedBalance) {
        Assertions.assertEquals(expectedBalance, atayDemirAcc.getBalance());
    }
    @Given("User is logged in to chase account")
    public void user_is_logged_in_to_chase_account() {

    }
    @Given("User has {int} in the account")
    public void user_has_in_the_account(Integer balanceAmount) throws Exception {
        aibek.deposit(balanceAmount);

    }
    @When("User deposits {int} to John Doe")
    public void user_deposits_to_john_doe(Integer balanceAmount) throws Exception{
        Bank.transferFunds(aibek, atayDemirAcc, balanceAmount);

    }
    @Then("User should have {int}")
    public void user_should_have(Integer balanceAmount) {
        Assertions.assertEquals(Double.valueOf(balanceAmount), aibek.getBalance());

    }
    @Then("John Doe Should not any deposits")
    public void john_doe_should_not_any_deposits() {
        System.out.println(aibek.getBalance());

    }


}

package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user enters the email (.*)")
    public void entersEmail(String email) {
        LoginService.doLoginEmail(email);
    }
    @And("Enters the password (.*)")
    public void enterPassword(String password) {
        LoginService.doLoginPassword(password);
    }

    @And("Clicks on Log In Button")
    public void clicksOnLogInButton() {
        LoginService.clickLogIn();
    }

    @And("Clicks on the Menu button")
    public void clicksOnTheMenuButton() {
        LoginService.clickMenuButton();
    }

    @And("Clicks on the Log Out button")
    public void clicksOnTheLogOutButton() {
        LoginService.clickLogOutButton();
    }

    @And("Clicks Confirm on the confirmation pop up")
    public void clicksConfirmOnTheConfirmationPopUp() {
        LoginService.clickConfirmButton();
    }

    @Then("The user is in the Log in page")
    public void theUserIsInTheLogInPage() {
        LoginService.confirmLogOut();
    }

    @And("The user is logued with email '(.*)' and password '(.*)'")
    public void theUserIsLoguedWithEmailPruebaqamanualGmailComAndPasswordCrowdar(String email, String password) {
        LoginService.doLoginEmail(email);
        LoginService.doLoginPassword(password);
        LoginService.clickLogIn();
    }
}

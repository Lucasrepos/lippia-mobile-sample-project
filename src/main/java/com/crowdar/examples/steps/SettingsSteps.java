package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.SettingsService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SettingsSteps extends PageSteps {
    @And("Clicks on the Settings button")
    public void clicksOnTheSettingsButton() {
        SettingsService.clickSettings();
    }

    @And("Clicks to activate the Dark mode")
    public void clicksToActivateTheDarkMode() {
        SettingsService.clickSwitchDarkMode();
    }

    @Then("Dark mode is enabled")
    public void darkModeIsEnabled() {
        SettingsService.validateDarkMode();
    }
}

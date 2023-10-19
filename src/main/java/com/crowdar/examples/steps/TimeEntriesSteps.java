package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.TimeEntriesService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.sql.Time;

public class TimeEntriesSteps extends PageSteps {

    @And("Clicks on the plus button")
    public void clicksOnThePlusButton() {
        TimeEntriesService.clickPlusButton();
    }


    @And("Set the hours '(.*)' and minutes '(.*)'")
    public void setTheHoursHoursAndMinutesMinutes(String hours, String minutes) {
        TimeEntriesService.entryHours(hours);
        TimeEntriesService.entryMinutes(minutes);
    }

    @And("Select the Crowdar Academy project on the Project Menu")
    public void setTheCrowdarAcademyProjectOnTheProjectMenu() {
        TimeEntriesService.selectProject();
        TimeEntriesService.selectCrowdarProject();
    }

    @And("Set the description '(.*)'")
    public void setTheDescriptionDescription(String description) {
        TimeEntriesService.setDescription(description);
    }

    @And("Clicks on the save button")
    public void clicksOnTheSaveButton() {
        TimeEntriesService.clickSaveButton();
    }

    @Then("The time entry is saved")
    public void theTimeEntryIsSaved() {
        TimeEntriesService.entryHoursVerification();
    }

    @And("Clicks on Back button")
    public void clicksOnDiscardButton() {
        TimeEntriesService.clickBackButton();
    }

    @And("Clicks on Discard button in the confirmation pop up")
    public void clicksOnDiscardButtonInTheConfirmationPopUp() {
        TimeEntriesService.clickDiscardPopup();
    }

    @Then("Time Entries Page is displayed")
    public void timeEntriesPageIsDisplayed() {
        TimeEntriesService.validateTimeEntriesPage();
    }

    @And("Set the start date (.*) and the end date (.*)")
    public void setTheStartDateStartDateAndTheEndDateEndDate(String startDate, String endDate) {
        TimeEntriesService.insertDates(startDate, endDate);
    }
}

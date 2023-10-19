package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TimeEntriesConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TimeEntriesService {
    public static void clickPlusButton(){
        MobileActionManager.click(TimeEntriesConstants.PLUS_BUTTON);
    }
    public static void entryHours(String hours) {
        WebElement element = MobileActionManager.getElement(TimeEntriesConstants.INPUT_HOURS);
        while (!element.getText().equals(hours)){
            MobileActionManager.click(TimeEntriesConstants.HOURS_BUTTON);
        }
    }

    public static void entryMinutes(String minutes) {
        WebElement element = MobileActionManager.getElement(TimeEntriesConstants.INPUT_MINUTES);
        while (!element.getText().equals(minutes)){
            MobileActionManager.click(TimeEntriesConstants.MINUTES_BUTTON);
        }
    }
    public static void selectProject(){
        MobileActionManager.click(TimeEntriesConstants.PROJECT_BUTTON);
    }
    public static void selectCrowdarProject(){
        MobileActionManager.click(TimeEntriesConstants.CROWDAR_PROJECT);
    }
    public static void setDescription(String description){
        MobileActionManager.setInput(TimeEntriesConstants.INPUT_DESCRIPTION, description);
    }
    public static void clickSaveButton(){
        MobileActionManager.waitVisibility(TimeEntriesConstants.SAVE_BUTTON);
        MobileActionManager.click(TimeEntriesConstants.SAVE_BUTTON);
    }
    public static void entryHoursVerification(){
        MobileActionManager.waitVisibility(TimeEntriesConstants.DIV_HOURS_DESCRIPTION);
        //Assert.assertTrue(MobileActionManager.isVisible(TimeEntriesConstants.HOURS_LABEL_DESCRIPTION), TimeEntriesConstants.HOURS_NOT_DISPLAYED_MESSAGE);
    }
    public static void clickBackButton(){
        MobileActionManager.click(TimeEntriesConstants.BACK_ARROW_BUTTON);
    }
    public static void clickDiscardPopup(){
        MobileActionManager.waitVisibility(TimeEntriesConstants.DISCARD_BUTTON_POPUP);
        MobileActionManager.click(TimeEntriesConstants.DISCARD_BUTTON_POPUP);
    }
    public static void validateTimeEntriesPage(){
        MobileActionManager.waitVisibility(TimeEntriesConstants.TIME_ENTRIES_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(TimeEntriesConstants.TIME_ENTRIES_HEADER));
    }
    public static void insertDates(String startDate, String endDate){
        MobileActionManager.click(TimeEntriesConstants.ADD_DATES);
        MobileActionManager.click(TimeEntriesConstants.START_DATE, startDate);
        MobileActionManager.click(TimeEntriesConstants.SAVE_DATE_BUTTON);
        MobileActionManager.click(TimeEntriesConstants.ADD_DATES);
        MobileActionManager.click(TimeEntriesConstants.END_BUTTON);
        MobileActionManager.click(TimeEntriesConstants.END_DATE, endDate);
        MobileActionManager.click(TimeEntriesConstants.SAVE_DATE_BUTTON);


    }

}

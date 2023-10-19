package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SettingsConstants;
import io.cucumber.java.eo.Se;
import org.testng.Assert;

public class SettingsService {
    public static void clickSettings(){
        MobileActionManager.click(SettingsConstants.SETTINGS_BUTTON);
    }
    public static void clickSwitchDarkMode(){
        MobileActionManager.click(SettingsConstants.SWITCH_DARK_MODE);
    }
    public static void validateDarkMode(){
        String darkStatus = MobileActionManager.getElement(SettingsConstants.SWITCH_DARK_MODE).getAttribute("text");
        System.out.println(darkStatus);
        Assert.assertEquals(darkStatus, "ON");
    }
}

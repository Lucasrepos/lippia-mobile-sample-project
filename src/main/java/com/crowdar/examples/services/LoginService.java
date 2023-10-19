package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLoginEmail(String email){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
    }
    public static void doLoginPassword(String password){
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);

    }
    public static void clickLogIn(){
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.SIGN_UP_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void clickMenuButton(){
        MobileActionManager.click(LoginConstants.OPEN_NAVIGATION_MENU);
    }
    public static void clickLogOutButton(){
        MobileActionManager.click(LoginConstants.LOG_OUT_BUTTON);
    }
    public static void clickConfirmButton(){
        MobileActionManager.click(LoginConstants.CONFIRM_BUTTON);
    }
    public static void confirmLogOut(){
        MobileActionManager.waitVisibility(LoginConstants.LOG_IN_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.LOG_IN_HEADER));
    }
}

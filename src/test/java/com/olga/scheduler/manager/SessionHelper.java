package com.olga.scheduler.manager;

import com.olga.scheduler.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {

    public SessionHelper(AppiumDriver driver) {
        super(driver);
    }

    public void fillLogInForm(User user) {

        type(By.id(""), user.getUserName());
        type(By.id(""), user.getPassword());

    }

    public void confirmLogin() {
        tap(By.id(""));
    }
}

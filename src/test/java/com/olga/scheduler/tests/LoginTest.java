package com.olga.scheduler.tests;

import com.olga.scheduler.model.User;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLogIn() throws InterruptedException {

        app.getSessionHelper().pause(5000);
        app.getSessionHelper().fillLogInForm(new User()
                .withUserName("olgatester22@gmail.com")
                .withPassword("Gmail12358"));


        app.getSessionHelper().confirmLogin();

    }
}

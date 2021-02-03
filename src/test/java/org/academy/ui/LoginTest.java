package org.academy.ui;

import org.academy.utils.ui.WebConfig;
import org.academy.ui.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        loginPage = new LoginPage(true, WebConfig.getAccountUrl());
    }

    @Test
    public void positiveLoginTest() {
        loginPage
                .fillLoginField(WebConfig.getLogin())
                .fillPassField(WebConfig.getPassword())
                .clickOnLoginButton();
    }

    @Test
    public void logoutTest() {
        loginPage
                .fillLoginField(WebConfig.getLogin())
                .fillPassField(WebConfig.getPassword())
                .clickOnLoginButton()
                .clickOnMyUsername()
                .clickOnLogout();
    }

}

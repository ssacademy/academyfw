package org.academy.ui;

import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.SettingsPage;
import org.academy.ui.steps.LoginSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {

    private SettingsPage settingsPage;
    private LoginSteps loginSteps = new LoginSteps();
    private MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void checkEmail() {
        settingsPage = mainPage
                .clcikOnNavigationUser()
                .clickOnNavigationUserSettings()
                .checkEmail();
    }
}

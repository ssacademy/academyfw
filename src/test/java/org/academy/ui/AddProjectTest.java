package org.academy.ui;

import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.academy.utils.ui.WebConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProjectTest extends BaseTest {
    LoginSteps loginSteps = new LoginSteps();
    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void addProjectTest() throws InterruptedException {
        mainPage.clickOnAddProjectBtn()
                .fillNameField(WebConfig.getProjectName())
                .fillAnnouncementField(WebConfig.getProjectAnnouncement())
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }
}

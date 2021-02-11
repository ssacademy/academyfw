package org.academy.ui;

import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.academy.utils.ui.WebConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteProjectTest extends BaseTest{
    LoginSteps loginSteps = new LoginSteps();
    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void removeProjectTest() {
        mainPage.clickOnAdministrationLink()
                .clickOnProjectsBtn()
                .clickRemoveBtn(WebConfig.getProjectName())
                .clickOnCheckbox()
                .clickOnOkBtn();
    }
}

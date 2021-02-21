package org.academy.ui;

import org.academy.ui.pages.SuitePage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SuiteTest extends BaseTest {

    private LoginSteps loginSteps = new LoginSteps();
    private MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void addSuiteTest() {
        SuitePage suitePage = mainPage.clickOnProjectLink()
                .clickOnTestCasesLink();
        try {
            suitePage.clickOnAddSectionBtn()
                    .fillNameField("Test Section")
                    .fillDescriptionField("Test Description");
            suitePage.clickOnAcceptBtn();

        } catch (RuntimeException e) {
            suitePage.clickOnAddSectionLink()
                    .fillNameField("Test Section")
                    .fillDescriptionField("Test Description");
            suitePage.clickOnAcceptBtn();
            suitePage.refreshPage();
        } finally {
            suitePage.waitUntilElementIsClickable(suitePage.getSectionTitle());
            suitePage.placeCursorOverElement();
            suitePage
                    .clickOnDeleteBtn()
                    .clickOnConfirmDeleteCheckBox()
                    .clickOnOkBtn();
        }
    }
}

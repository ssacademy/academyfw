package org.academy.ui;

import org.academy.ui.pages.AddSuitePage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.slf4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

public class AddSuiteTest extends BaseTest {

    static final Logger log = getLogger(lookup().lookupClass());
    private LoginSteps loginSteps = new LoginSteps();
    private MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @AfterSuite
    public void teardown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void addSuiteTest() throws InterruptedException {
        AddSuitePage addSuitePage = mainPage.clickOnProjectLink()
                .clickOnTestCasesLink();
        try {
            addSuitePage.clickOnAddSectionBtn()
                    .fillNameField("Test Section")
                    .fillDescriptionField("Test Description");
            addSuitePage.clickOnAcceptBtn();

        } catch (RuntimeException e) {
            addSuitePage.clickOnAddSectionLink()
                    .fillNameField("Test Section")
                    .fillDescriptionField("Test Description");
            addSuitePage.clickOnAcceptBtn();
            addSuitePage.refreshPage();
        } finally {
            addSuitePage.waitUntilElementIsClickable(addSuitePage.getSectionTitle());
            addSuitePage.placeCursorOverElement();
            addSuitePage
                    .clickOnDeleteBtn()
                    .clickOnConfirmDeleteCheckBox()
                    .clickOnOkBtn();
        }
    }
}

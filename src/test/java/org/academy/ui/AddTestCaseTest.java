package org.academy.ui;

import org.academy.ui.pages.AddTestCasePage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddTestCaseTest extends BaseTest {

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
    public void addTestCaseTest() throws InterruptedException {
        AddTestCasePage addTestCasePage = mainPage.clickOnProject()
                .clickOnTestCaseLink();
            addTestCasePage
                    .clickOnAddTestCaseBtn()
                    .fillTitleField("Test case Test");
            addTestCasePage.scrollToElement(webDriver, addTestCasePage.getAcceptBtn());
            addTestCasePage
                    .clickOnAcceptBtn();
    }
}

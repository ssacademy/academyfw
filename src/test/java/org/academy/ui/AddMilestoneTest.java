package org.academy.ui;


import org.academy.ui.pages.AddMilestonePage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.steps.LoginSteps;
import org.academy.utils.ui.WebConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddMilestoneTest extends BaseTest {
    LoginSteps loginSteps = new LoginSteps();
    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = loginSteps.makeLogin();
    }

    @Test
    public void addMilestoneTest() {
        mainPage
                .clickOnProjectLink2()
                .clickOnAddMilestoneBtn()
                .fillMilestoneNameField(WebConfig.getMilestoneName())
                .fillMilestoneReferenceField(WebConfig.getMilestoneReference())
                .fillMilestoneDescriptionField(WebConfig.getMilestoneDescription())
                .clickOnStartDate()
                .clickOnHighlightedDate()
                .clickOnEndDate()
                .clickOnHighlightedDate()
                .clickOnMilestoneAcceptBtn();

    }
}

package org.academy.ui;

import org.academy.ui.pages.project.EditProjectPage;
import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.project.TestSuite;
import org.academy.ui.steps.LoginSteps;
import org.academy.ui.steps.ProjectSteps;
import org.academy.utils.ui.WebConfig;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditProjectTest extends BaseTest {
    private LoginSteps loginSteps = new LoginSteps();
    private ProjectSteps projectSteps = new ProjectSteps();

    private EditProjectPage editProjectPage;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        loginSteps.makeLogin();
        editProjectPage = projectSteps.openEditProjectPage();
    }

    @Test
    public void editSuiteOfProjectTest() throws InterruptedException {
        editProjectPage.chooseTestSuite(TestSuite.MULTIPLE)
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }

    @Test(priority = 1, groups = "editAnnouncement")
    public void clearAnnouncementTest() throws InterruptedException {
        editProjectPage
                .clearAnnouncementField()
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }

    @Test(groups = "editAnnouncement")
    public void updateAnnouncementTest() throws InterruptedException {
        editProjectPage
                .fillAnnouncementField(WebConfig.getProjectAnnouncement())
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }
}

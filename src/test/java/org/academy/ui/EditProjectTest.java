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

    private MainPage mainPage;
    private EditProjectPage editProjectPage;

    @BeforeClass(alwaysRun = true)
    public void login() {
        mainPage = loginSteps.makeLogin();
    }

    @BeforeMethod(alwaysRun = true)
    public void precondtion() {
        editProjectPage = projectSteps.openEditProjectPage(WebConfig.getProjectName());
    }

    @Test
    public void editSuiteOfProjectTest() throws InterruptedException {
        editProjectPage.chooseTestSuite(TestSuite.SINGLEALLCASES)
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }

    @Test
    public void clearAnnouncementTest() throws InterruptedException {
        editProjectPage
                .clearAnnouncementField()
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }

    @Test(priority = 1)
    public void updateAnnouncementTest() throws InterruptedException {
        editProjectPage
                .fillAnnouncementField(WebConfig.getProjectAnnouncement())
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }
}

package org.academy.ui;

import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.administration.ProjectsPage;
import org.academy.ui.steps.LoginSteps;
import org.academy.ui.steps.ProjectSteps;
import org.academy.utils.ui.WebConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteProjectTest extends BaseTest{
    private LoginSteps loginSteps = new LoginSteps();
    private ProjectSteps projectSteps = new ProjectSteps();

    private MainPage mainPage;
    private ProjectsPage projectsPage;

    private String projectName = "Remove Project";

    @BeforeMethod(alwaysRun = true)
    public void precondition() throws InterruptedException {
        mainPage = loginSteps.makeLogin();
        projectsPage = projectSteps.createProject(projectName);
    }

    @Test
    public void removeProjectTest() {
        mainPage.clickOnAdministrationLink()
                .clickOnProjectsBtn()
                .clickRemoveBtn(projectName)
                .clickOnCheckbox()
                .clickOnOkBtn();
    }
}

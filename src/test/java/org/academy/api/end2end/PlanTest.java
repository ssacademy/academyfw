package org.academy.api.end2end;

import org.academy.api.BaseTest;
import org.academy.api.requests.PlanRequests;
import org.academy.api.requests.ProjectRequests;
import org.academy.ui.steps.LoginSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlanTest extends BaseTest {
    private final ProjectRequests projectRequests = new ProjectRequests();
    private final PlanRequests planRequests = new PlanRequests();
    private final LoginSteps loginSteps = new LoginSteps();

    String projectName = "Api project_".concat(apiHelpers.getCurrentTimestamp());
    String planName = "Simple test plan";
    String projectDescription = dr.getRandomStringStartsUpperCase(5, 5).toString();
    String description = dr.getRandomStringStartsUpperCase(3, 3).toString();
    Integer projectId;
    boolean toShow = true;
    int suiteMode = 1;

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        projectId = (Integer) (projectRequests.createProjectRequestHM(projectName, projectDescription, toShow, suiteMode).get("id"));
        planRequests.addPlanRequest(planName, description, projectId);
    }

    @Test
    public void testPlanUiTest() {
        loginSteps
                .makeLogin()
                .clickOnProject(projectName)
                .clickOnProjectPlan(planName);
    }

    @AfterMethod
    public void delete() {
        projectRequests.deleteProjectRequest(projectId);
    }
}

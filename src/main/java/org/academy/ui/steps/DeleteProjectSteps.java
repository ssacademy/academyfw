package org.academy.ui.steps;

import lombok.extern.slf4j.Slf4j;
import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.administration.ProjectsPage;
import org.academy.utils.ui.WebConfig;

@Slf4j
public class DeleteProjectSteps {
    public ProjectsPage deleteProject() {
        return deleteProject(WebConfig.getProjectName());
    }

    public ProjectsPage deleteProject(String projectName) {
        return new MainPage()
                .clickOnAdministrationLink()
                .clickOnProjectsBtn()
                .clickRemoveBtn(projectName)
                .clickOnCheckbox()
                .clickOnOkBtn();
    }
}

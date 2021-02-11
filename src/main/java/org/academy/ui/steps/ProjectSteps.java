package org.academy.ui.steps;

import lombok.extern.slf4j.Slf4j;
import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.project.EditProjectPage;

@Slf4j
public class ProjectSteps {
    public EditProjectPage openEditProjectPage(String projectName) {
        return new MainPage()
                .clickOnAdministrationLink()
                .clickOnProjectsBtn()
                .clickOnProjectPage(projectName);
    }
}

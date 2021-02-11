package org.academy.ui.steps;

import lombok.extern.slf4j.Slf4j;
import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.administration.ProjectsPage;
import org.academy.ui.pages.project.EditProjectPage;
import org.academy.utils.ui.WebConfig;

@Slf4j
public class ProjectSteps {
    public ProjectsPage createProject() throws InterruptedException {
        return createProject(WebConfig.getProjectName(), WebConfig.getProjectAnnouncement());
    }

    public ProjectsPage createProject(String name) throws InterruptedException {
        return createProject(name, WebConfig.getProjectAnnouncement());
    }

    public ProjectsPage createProject(String name, String announcement) throws InterruptedException {
        return new MainPage()
                .clickOnAddProjectBtn()
                .fillNameField(name)
                .fillAnnouncementField(announcement)
                .scrollToAcceptBtn()
                .clickOnAcceptBtn();
    }

    public EditProjectPage openEditProjectPage() {
        return openEditProjectPage(WebConfig.getProjectName());
    }

    public EditProjectPage openEditProjectPage(String projectName) {
        return new MainPage()
                .clickOnAdministrationLink()
                .clickOnProjectsBtn()
                .clickOnProjectPage(projectName);
    }
}

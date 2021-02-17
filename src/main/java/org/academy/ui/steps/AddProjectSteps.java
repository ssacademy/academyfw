package org.academy.ui.steps;

import lombok.extern.slf4j.Slf4j;
import org.academy.ui.pages.MainPage;
import org.academy.ui.pages.administration.ProjectsPage;
import org.academy.utils.ui.WebConfig;

@Slf4j
public class AddProjectSteps {
    public ProjectsPage createProject() {
        return createProject(WebConfig.getProjectName(), WebConfig.getProjectAnnouncement());
    }

    public ProjectsPage createProject(String name) {
        return createProject(name, WebConfig.getProjectAnnouncement());
    }

    public ProjectsPage createProject(String name, String announcement) {
        return new MainPage()
                .clickOnAddProjectBtn()
                .fillNameField(name)
                .fillAnnouncementField(announcement)
                .clickOnAcceptBtn();
    }
}

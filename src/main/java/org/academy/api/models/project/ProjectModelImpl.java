package org.academy.api.models.project;

public class ProjectModelImpl {
    public ProjectModel createProjectWithAllAttributes(String name, String announcement, boolean showAnnouncement,
                                                       int suiteMode) {
        return new ProjectModel.Builder()
                .name(name)
                .announcement(announcement)
                .showAnnouncement(showAnnouncement)
                .suiteMode(suiteMode)
                .build();
    }

    public ProjectModel createProjectWithoutSuite(String name, String announcement, boolean showAnnouncement) {
        return new ProjectModel.Builder()
                .name(name)
                .announcement(announcement)
                .showAnnouncement(showAnnouncement)
                .build();
    }
}

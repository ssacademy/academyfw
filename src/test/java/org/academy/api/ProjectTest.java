package org.academy.api;

import lombok.extern.slf4j.Slf4j;
import org.academy.api.requests.ProjectRequests;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ProjectTest extends BaseTest {
    private final ProjectRequests projectRequests = new ProjectRequests();

    @Test
    public void createProjectCase() {
        String projectName = "project_".concat(apiHelpers.getCurrentTimestamp());
        String projectNameFromResponse =
                String.valueOf(projectRequests.createProjectRequest(projectName).get("role"));
        assertThat(projectNameFromResponse).isEqualTo(projectName)
                .as("Project name from response should be the same as " + projectName);
    }

    @Test
    public void updateProjectNameCase() {
        String projectName = "project_".concat(apiHelpers.getCurrentTimestamp());

        List<Map<String, Object>> request = projectRequests.getAllProjectsRequest();
        assertThat(request.get(0).get("status")).isEqualTo(200);

        String newProjectNameFromResponse = String.valueOf(projectRequests.updateProjectNameRequest(
                (int) request.get(1).get("id"),
                projectName).get("name"));
        assertThat(newProjectNameFromResponse).isEqualTo(projectName)
                .as("Project name from response should be the same as " + projectName);
    }
}

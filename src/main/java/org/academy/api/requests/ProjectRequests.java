package org.academy.api.requests;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;
import org.academy.api.payloads.ProjectPayloads;
import org.json.JSONObject;

public class ProjectRequests extends Requests {
    private final ProjectPayloads projectPayloads = new ProjectPayloads();

    public Map<String, Object> createProjectRequest(String projectName, String announcement, boolean showAnnouncement,
                                                    int... suiteMode) {
        Response response =
                postMethods.withoutParams(addProjectResource(),
                        projectPayloads.createProjectPayload(projectName, announcement, showAnnouncement, suiteMode));

        JSONObject jsonObject = new JSONObject(response.asString());
        return new HashMap<String, Object>() {
            {
                put("role", jsonObject.get("name"));
            }
        };
    }
}

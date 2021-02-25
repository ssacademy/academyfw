package org.academy.api.requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.academy.api.payloads.ProjectPayloads;
import org.json.JSONArray;
import org.json.JSONObject;

public class ProjectRequests extends Requests {
    private final ProjectPayloads projectPayloads = new ProjectPayloads();

    public Map<String, Object> createProjectRequest(String projectName) {
        Response response =
                postMethods.withoutParams(addProjectResource(), projectPayloads.projectPayload(projectName));

        JSONObject jsonObject = new JSONObject(response.asString());
        return new HashMap<String, Object>() {
            {
                put("role", jsonObject.get("name"));
            }
        };
    }

    public List<Map<String, Object>> getAllProjectsRequest() {
        List<Map<String, Object>> objects = new ArrayList<>();
        Response response = getMethods.withoutParams(allProjectsResource());
        JSONArray jsonArray = new JSONArray(response.asString());
        objects.add(new HashMap<String, Object>() {{
            put("status", response.statusCode());
        }});

        for (int i = 0; i < jsonArray.length(); i++) {
            Map<String, Object> obj = new HashMap<>();
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            obj.put("name", jsonObject.get("name"));
            obj.put("id", jsonObject.get("id"));

            objects.add(obj);
        }

        return objects;
    }

    public Map<String, Object> updateProjectNameRequest(int projectId, String projectName) {
        Response response = postMethods.withoutParams(
                updateProjectResource() + projectId,
                projectPayloads.updateProjectPayload(projectName));
        JSONObject jsonObject = new JSONObject(response.asString());
        return new HashMap<String, Object>() {
            {
                put("name", jsonObject.get("name"));
            }
        };
    }
}

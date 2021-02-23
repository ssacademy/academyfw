package org.academy.api.payloads;

import org.json.JSONObject;

public class ProjectPayloads {
    public static final String ANNOUNCEMENT = "This is the description for the project";
    public static final boolean SHOW_ANNOUNCEMENT = true;
    public static final boolean IS_COMPLETED = true;

    public String projectPayload(String projectName) {
        return String.format("{\n" +
                "\t\"name\": \"%s\",\n" +
                "\t\"announcement\": \"This is the description for the project\",\n" +
                "\t\"show_announcement\": true\n" +
                "}", projectName);
    }

    public JSONObject projectAllFieldsPayload(String projectName) {
        JSONObject requestParams = new JSONObject();

        requestParams.put("name", projectName);
        requestParams.put("announcement", ANNOUNCEMENT);
        requestParams.put("show_announcement", SHOW_ANNOUNCEMENT);
        requestParams.put("is_completed", IS_COMPLETED);

        return requestParams;
    }
}

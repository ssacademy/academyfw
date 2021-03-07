package org.academy.api.requests;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CasesRequests extends Requests {

    public Map<String, Object> createCaseRequest(String caseName) {
        Response response =
                postMethods.withoutParams(addCaseResource(), caseName);

        JSONObject jsonObject = new JSONObject(response.asString());
        return new HashMap<String, Object>() {
            {
                put("name", jsonObject.get("title"));
            }
        };
    }

    public Map<String,Object> getAllCasesRequest() {
        Response response = getMethods.withoutParams(allCasesResource());

        JSONArray jsonArray = new JSONArray(response.asString());
        return new HashMap<String, Object>() {
            {
                    put("title", ((JSONObject) jsonArray.get(0)).get("title"));
            }
        };
    }
}

package org.academy.api.requests;

import java.util.List;
import java.util.Map;

import io.restassured.response.Response;
import org.academy.api.payloads.PlanPayloads;

import org.academy.utils.api.methods.ConvertMethods;

public class PlanRequests extends Requests {
    private final PlanPayloads planPayloads = new PlanPayloads();

    public Map<String, Object> addPlanRequest(String planName, String description,
                                              List<Object> entries, int... milestoneId) {
        Response response =
                postMethods.withoutParams(addPlanResource(),
                        planPayloads.addPlanPayload(planName, description, entries, milestoneId));
        return ConvertMethods.convertResponseFromServerToHashMap(response);
    }
    public Map<String, Object> addPlanRequest(String planName, String description, int projectId) {
        Response response =
                postMethods.withoutParams(addPlanResource()+projectId,
                        planPayloads.addPlanPayload(planName, description));
        return ConvertMethods.convertResponseFromServerToHashMap(response);
    }

    public Map<String, Object> getPlanRequest() {
        Response response = getMethods.withoutParams(getPlanResource());
        return ConvertMethods.convertResponseFromServerToHashMap(response);
    }
}

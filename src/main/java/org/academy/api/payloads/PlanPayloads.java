package org.academy.api.payloads;

import lombok.extern.slf4j.Slf4j;
import org.academy.api.models.plans.PlanModel;
import java.util.List;

@Slf4j
public class PlanPayloads extends Payload {

    public String addPlanPayload(String name, String description, List<Object> entries, int... milestoneId) {
        PlanModel planModel = milestoneId.length > 0
                ? new PlanModel.Builder()
                .name(name)
                .description(description)
                .entries(entries)
                .milestoneId(milestoneId[0])
                .build()

                : new PlanModel.Builder()
                .name(name)
                .description(description)
                .entries(entries)
                .build();

        String payload = jsonFromObject(planModel);
        log.info("TestPlan payload added = \r\n" + payload);
        return payload;
    }
    public String addPlanPayload(String name, String description) {
        PlanModel planModel = new PlanModel.Builder()
                .name(name)
                .description(description)
                .build();
        String payload = jsonFromObject(planModel);
        log.info("TestPlan payload created = \r\n" + payload);
        return payload;
    }

}
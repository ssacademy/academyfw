package org.academy.api.models.plans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class PlanModel {
    private String name;
    private String description;
    @JsonProperty("milestone_id")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int milestoneId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private List<Object> entries;

    public PlanModel(Builder builder) {
        name = builder.name;
        description = builder.description;
        milestoneId = builder.milestoneId;
        entries = builder.entries;
    }

    public PlanModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String announcement) {
        this.description = description;
    }

    public int getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(int milestoneId) {
        this.milestoneId = milestoneId;
    }

    public List<Object> getEntries() {
        return entries;
    }

    public void setEntries(List<Object> entries) {
        this.entries = entries;
    }


    public static class Builder {
        private String name;
        private String description;
        private int milestoneId;
        private List<Object> entries;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder milestoneId(int milestoneId) {
            this.milestoneId = milestoneId;
            return this;
        }

        public Builder entries(List<Object> entries) {
            this.entries = entries;
            return this;
        }

        public PlanModel build() {
            return new PlanModel(this);
        }
    }
}

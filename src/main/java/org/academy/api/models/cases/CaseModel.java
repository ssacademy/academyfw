package org.academy.api.models.cases;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class CaseModel {

  @JsonProperty("updated_id")
  private Integer updatedId;

  @JsonProperty("created_by")
  private Integer createdBy;

  @JsonProperty("created_on")
  private Timestamp createdOn;

  @JsonProperty("custom_expected")
  private String customExpected;

  @JsonProperty("custom_preconds")
  private String customPreconds;

  @JsonProperty("custom_steps")
  private String customSteps;

  @JsonProperty("custom_steps_seperated")
  private List<Map<String,String>> customStepsSeparated;

  private Long estimate;
  
  @JsonProperty("estimate_forecast")
  private Long estimateForecast;

  private Integer id;

  @JsonProperty("milestone_id")
  private Integer milestoneId;

  @JsonProperty("priority_id")
  private Integer priorityId;

  private List<String> refs;

  @JsonProperty("section_id")
  private Integer sectionId;

  @JsonProperty("suite_id")
  private Integer suiteId;

  private String title;

  @JsonProperty("type_id")
  private Integer typeId;

  @JsonProperty("updated_by")
  private Integer updatedBy;

  @JsonProperty("updated_on")
  private Timestamp updatedOn;

  @JsonProperty("template_id")
  private Integer templateId;

  public CaseModel() {}
  public CaseModel(Builder builder) {
    createdBy = builder.createdBy;
    createdOn = builder.createdOn;
    estimate = builder.estimate;
    estimateForecast = builder.estimateForecast;
    id = builder.id;
    priorityId = builder.priorityId;
    milestoneId = builder.milestoneId;
    refs = builder.refs;
    sectionId = builder.sectionId;
    suiteId = builder.suiteId;
    templateId = builder.templateId;
    title = builder.title;
    typeId = builder.typeId;
    updatedId = builder.updatedId;
    updatedOn = builder.updatedOn;
  }

  public static class Builder {
    private Integer createdBy;
    private Timestamp createdOn;
    private Long estimate;
    private Long estimateForecast;
    private Integer id;
    private Integer priorityId;
    private Integer milestoneId;
    private List<String> refs;
    private Integer sectionId;
    private Integer suiteId;
    private Integer templateId;
    private String title;
    private Integer typeId;
    private Integer updatedId;
    private Timestamp updatedOn;

    public Builder() {}

    public Builder id(int id) {
      this.id = id;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder suiteId(int suiteId) {
      this.suiteId = suiteId;
      return this;
    }

    public Builder createdBy(int createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public CaseModel build() {
      return new CaseModel(this);
    }
  }
}

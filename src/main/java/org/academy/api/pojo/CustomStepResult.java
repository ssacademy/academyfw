
package org.academy.api.pojo;
import com.google.gson.annotations.SerializedName;

public class CustomStepResult {
    @SerializedName("content")
    private String content;
    @SerializedName("expected")
    private String expected;
    @SerializedName("actual")
    private String actual;
    @SerializedName("status_id")
    private Integer statusId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

}

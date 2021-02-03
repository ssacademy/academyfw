
package org.academy.api.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RailStepResults {
    @SerializedName("results")
    private List<Result> results = new ArrayList<>();

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}

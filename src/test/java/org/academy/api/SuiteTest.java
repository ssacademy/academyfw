package org.academy.api;

import org.academy.api.requests.SuiteRequests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SuiteTest extends BaseTest {
    private final SuiteRequests suiteRequests = new SuiteRequests();

    @Test
    public void getSuiteTitle() {
        String suiteTitle = String.valueOf(suiteRequests.getAllSuitesRequest().get("title"));
        assertThat(suiteTitle).isEqualTo("MySuite1").as("Suite title need to be 'MySuite1'");
    }
}

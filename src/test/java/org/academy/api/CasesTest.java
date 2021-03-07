package org.academy.api;

import lombok.extern.slf4j.Slf4j;
import org.academy.api.requests.CasesRequests;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class CasesTest extends BaseTest {
    private final CasesRequests casesRequests = new CasesRequests();

    @Test
    public void getCaseTitle() {
        String casesTitle = String.valueOf(casesRequests.getAllCasesRequest().get("title"));
        assertThat(casesTitle.substring(0,4)).isEqualTo("case").as("Case title need to be 'case1'");
    }

    @Test
    public void getAllCases() {
        casesRequests.getAllCasesRequest();
    }

    @Test
    public void addCase() {
        String caseName = "C".concat("getId()");
        String caseNameResponse = String.valueOf(casesRequests.createCaseRequest(caseName).get("title"));
        assertThat(caseNameResponse).isEqualTo(caseName).as("Case name expected: " + caseName);
    }
}

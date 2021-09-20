package org.academy.tools;

import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.academy.PropertyReader;
import org.testng.*;

@Slf4j
public class TestNgListener implements ITestListener {
    public static Properties properties;

    @Override
    public void onStart(ITestContext context) {
        properties = new Properties();
        PropertyReader.get().readGlobalProperties();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("The name of the testcase passed is :" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("The name of the testcase failed is :" + result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        log.info(result.getName() + " test case started");
    }
}

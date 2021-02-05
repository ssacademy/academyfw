package org.academy.ui.pages;

import org.openqa.selenium.By;

public class AddTestCasePage extends AbstractPage {
    public AddTestCasePage() {
        super();
    }

    public AddTestCasePage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By titleField = By.xpath("//form[@class='inline form-inline addForm']//input[@type='text']");
    private static final By acceptBtn = By.xpath("//span[@class='buttons']//button[@type='submit']");
    private static final By testCaseLink = By.xpath("//a[@id='navigation-suites']");
    private static final By addTestCaseBtn = By.xpath("//a[contains(text(),'Add Case')]");

    public AddTestCasePage clickOnTestCaseLink() {
        waitUntilElementIsClickable(testCaseLink).click();
        return this;
    }
    public AddTestCasePage clickOnAddTestCaseBtn() {
        waitUntilElementIsClickable(addTestCaseBtn).click();
        return this;
    }

    public AddTestCasePage fillTitleField(String sectionName) {
        findElement(titleField).sendKeys(sectionName);
        return this;
    }

    public AddTestCasePage clickOnAcceptBtn() {
        waitUntilElementIsClickable(acceptBtn).click();
        return this;
    }
}

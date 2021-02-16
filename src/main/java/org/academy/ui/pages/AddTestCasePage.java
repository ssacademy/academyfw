package org.academy.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddTestCasePage extends AbstractPage {
    public AddTestCasePage() {
        super();
    }

    public AddTestCasePage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By titleField = By.xpath("//input[@id='title']");
    private static final By acceptBtn = By.xpath("//button[@id='accept']");
    private static final By testCaseLink = By.xpath("//a[@id='navigation-suites']");
    private static final By addTestCaseBtn = By.xpath("//a[@id='sidebar-cases-add']");

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

    public AddTestCasePage scrollToAcceptBtn() throws InterruptedException {
        scrollToElement(webDriver, webDriver.findElement(acceptBtn));
        return this;
    }

    public AddTestCasePage clickOnAcceptBtn() {
        waitUntilElementIsClickable(acceptBtn).click();
        return this;
    }
}

package org.academy.ui.pages;

import org.openqa.selenium.By;

public class AddSuitePage extends AbstractPage {
    public AddSuitePage() {
        super();
    }

    public AddSuitePage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By nameField = By.xpath("//input[@id='editSectionName']");
    private static final By descriptionField = By.xpath("//textarea[@id='editSectionDescription']");
    private static final By acceptBtn = By.xpath("//span[@class='editSectionAdd']");
    private static final By testCasesLink = By.xpath("//a[@id='navigation-suites']");
    private static final By addSectionBtn = By.xpath("//a[@id='addSectionInline']");

    public AddSuitePage clickOnTestCasesLink() {
        waitUntilElementIsClickable(testCasesLink).click();
        return this;
    }
    public AddSuitePage clickOnAddSectionBtn() {
        waitUntilElementIsClickable(addSectionBtn).click();
        return this;
    }


    public AddSuitePage fillNameField(String sectionName) {
        findElement(nameField).sendKeys(sectionName);
        return this;
    }

    public AddSuitePage fillDescriptionField(String sectionDescription) {
        findElement(descriptionField).sendKeys(sectionDescription);
        return this;
    }

    public AddSuitePage clickOnAcceptBtn() {
        waitUntilElementIsClickable(acceptBtn).click();
        return this;
    }
}

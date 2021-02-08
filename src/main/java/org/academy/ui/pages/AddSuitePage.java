package org.academy.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

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
    private static final By addSectionLink = By.xpath("//a[@id='addSection']");
    private static final By deleteBtn = By.xpath("//div[@class='icon-small-delete hidden action-hover']");
    private static final By okBtn = By.xpath("//div[@id='deleteDialog']//div[@class='button-group dialog-buttons-highlighted']//a[@class='button button-ok button-left button-positive dialog-action-default'][contains(text(),'OK')]");
    private static final By sectionTitle = By.xpath("//div[@class='grid-title']");
    private static final By confirmDeleteCheckBox = By.xpath("//div[@id='deleteDialog']//div[@class='dialog-body']//div[@class='message message-delete bottom delete-confirm-container']//div[@class='checkbox']//label//input[@type='checkbox']");

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

    public AddSuitePage clickOnAddSectionLink() {
        waitUntilElementIsClickable(addSectionLink).click();
        return this;
    }

    public AddSuitePage clickOnDeleteBtn() {
        waitUntilElementIsClickable(deleteBtn).click();
        return this;
    }

    public AddSuitePage clickOnOkBtn() {
        waitUntilElementIsClickable(okBtn).click();
        return this;
    }

    public void placeCursorOverElement() {
        Actions builder = new Actions(webDriver);
        builder.moveToElement(webDriver.findElement(sectionTitle)).perform();
    }

    public AddSuitePage clickOnConfirmDeleteCheckBox() {
        waitUntilElementIsClickable(confirmDeleteCheckBox).click();
        return this;
    }

    public By getSectionTitle() {
        return sectionTitle;
    }
}

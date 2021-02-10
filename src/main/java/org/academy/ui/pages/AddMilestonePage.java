package org.academy.ui.pages;

import org.openqa.selenium.By;

public class AddMilestonePage extends AbstractPage {
    public AddMilestonePage() {
        super();
    }

    public AddMilestonePage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By milestoneNameField = By.xpath("//input[@id='name']");
    private static final By milestoneReferenceField = By.xpath("//input[@id='reference']");
    private static final By milestoneDescriptionField = By.xpath("//input[@id='reference']");
    private static final By milestoneAcceptBtn = By.xpath("//button[@id='accept']");
    private static final By milestoneStartDate = By.xpath("//input[@id='start_on']");
    private static final By highlightedDate = By.xpath("//a[@class='ui-state-default ui-state-highlight']");
    private static final By milestoneEndDate = By.xpath("//input[@id='due_on']");
    private static final By addMilestoneBtn = By.xpath("//a[@id='navigation-overview-addmilestones']");

    public AddMilestonePage fillMilestoneNameField(String milestoneName) {
        findElement(milestoneNameField).sendKeys(milestoneName);
        return this;
    }

    public AddMilestonePage fillMilestoneReferenceField(String milestoneReference) {
        findElement(milestoneReferenceField).sendKeys(milestoneReference);
        return this;
    }

    public AddMilestonePage fillMilestoneDescriptionField(String milestoneDescription) {
        findElement(milestoneDescriptionField).sendKeys(milestoneDescription);
        return this;
    }

    public AddMilestonePage clickOnMilestoneAcceptBtn() {
        waitUntilElementIsClickable(milestoneAcceptBtn).click();
        return this;
    }

    public AddMilestonePage clickOnAddMilestoneBtn() {
        waitUntilElementIsClickable(addMilestoneBtn).click();
        return this;
    }

    public AddMilestonePage clickOnStartDate() {
        waitUntilElementIsClickable(milestoneStartDate).click();
        return this;
    }

    public AddMilestonePage clickOnHighlightedDate() {
        findElement(highlightedDate).click();
        return this;
    }

    public AddMilestonePage clickOnEndDate() {
        waitUntilElementIsClickable(milestoneEndDate).click();
        return this;
    }
}

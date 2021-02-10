package org.academy.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

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
    private static final By milestoneEndDate = By.xpath("//input[@id='due_on']");
    private static final By addMilestoneBtn = By.xpath("//a[@id='navigation-overview-addmilestones']");
    private static final By calendar = By.xpath("//table[@class='ui-datepicker-calendar']");
    private static final By calendarColumns = By.xpath("//body[@class='modern']/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr/td");

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

    public AddMilestonePage chooseAndClickOnStartDate() {
        String today = getCurrentDay();
        WebElement dateWidget = webDriver.findElement(calendar);
        List<WebElement> columns = dateWidget.findElements(calendarColumns);

        for (WebElement cell : columns) {
            if (cell.getText().equals(today)) {
                cell.findElement(By.linkText(today)).click();
                break;
            }
        }
        return this;
    }

    private String getCurrentDay() {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getDefault());
        int todayInt = calendar1.get(Calendar.DAY_OF_MONTH);
        String todayStr = Integer.toString(todayInt);
        return todayStr;
    }

    public AddMilestonePage clickOnEndDate() {
        waitUntilElementIsClickable(milestoneEndDate).click();
        return this;
    }

    public AddMilestonePage chooseAndClickOnEndDate() {
        String nextDay = getNextDay();
        WebElement dateWidget = webDriver.findElement(calendar);
        List<WebElement> columns = dateWidget.findElements(calendarColumns);

        for (WebElement cell : columns) {
            if (cell.getText().equals(nextDay)) {
                cell.findElement(By.linkText(nextDay)).click();
                break;
            }
        }
        return this;
    }

    private String getNextDay() {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getDefault());
        int todayInt = calendar1.get(Calendar.DAY_OF_MONTH);
        int nextInt = todayInt+1;
        String nextStr = Integer.toString(nextInt);
        return nextStr;
    }
}

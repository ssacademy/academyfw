package org.academy.ui.pages;

import org.openqa.selenium.By;

public class AddProjectPage extends AbstractPage {
    public AddProjectPage() {
        super();
    }

    public AddProjectPage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By nameField = By.xpath("//input[@id='name']");
    private static final By announcementField = By.xpath("//textarea[@id='announcement']");
    private static final By acceptBtn = By.xpath("//button[@id='accept']");

    public AddProjectPage fillNameField(String projectName) {
        findElement(nameField).sendKeys(projectName);
        return this;
    }

    public AddProjectPage fillAnnouncementField(String projectAnnouncement) {
        findElement(announcementField).sendKeys(projectAnnouncement);
        return this;
    }

    public AddProjectPage clickOnAcceptBtn() {
        waitUntilElementIsClickable(acceptBtn).click();
        return this;
    }
}

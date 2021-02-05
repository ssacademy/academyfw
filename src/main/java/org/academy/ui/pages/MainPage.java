package org.academy.ui.pages;

import org.openqa.selenium.By;

public class MainPage extends AbstractPage {

    public MainPage() {
        super();
    }

    public MainPage(boolean navigateToPage, String navigationUrl) {
        super(navigateToPage, navigationUrl);
    }

    private static final By usernameLink = By.xpath("//span[@class='navigation-username']");
    private static final By logout = By.xpath("//a[@id='navigation-user-logout']");
    private static final By addProjectBtn = By.xpath("//a[@id='sidebar-projects-add']");
    private static final By administrationLink = By.xpath("//a[@id='navigation-admin']");
    private static final By projectLink = By.xpath("//div[@id='project-7']//div[@class='column summary-column flex-projects-2']//div[@class='summary-title text-ppp']//a[contains(text(),'TestProject')]");

    public MainPage clickOnMyUsername() {
        waitUntilElementIsClickable(usernameLink).click();
        return this;
    }

    public MainPage clickOnLogout() {
        waitUntilElementIsClickable(logout).click();
        return this;
    }

    public AddProjectPage clickOnAddProjectBtn() {
        waitUntilElementIsClickable(addProjectBtn).click();
        return new AddProjectPage();
    }

    public AdministrationPage clickOnAdministrationLink() {
        waitUntilElementIsClickable(administrationLink).click();
        return new AdministrationPage();
    }

    public AddSuitePage clickOnProjectLink() {
        waitUntilElementIsClickable(projectLink).click();
        return new AddSuitePage();
    }

    public AddTestCasePage clickOnProject() {
        waitUntilElementIsClickable(projectLink).click();
        return  new AddTestCasePage();
    }
}


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

    public MainPage clickOnMyUsername() {
        waitUntilElementIsClickable(usernameLink).click();
        return this;
    }

    public MainPage clickOnLogout() {
        waitUntilElementIsClickable(logout).click();
        return this;
    }
}


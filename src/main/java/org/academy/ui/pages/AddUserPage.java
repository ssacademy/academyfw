package org.academy.ui.pages;


import org.openqa.selenium.By;

public class AddUserPage extends AbstractPage {
    public AddUserPage() {
        super();
    }

    public AddUserPage(boolean navigate, String navigateToUrl) {
        super(navigate, navigateToUrl);
    }

    private static final By fullNameField = By.xpath("//input[@id='name']");
    private static final By emailField = By.xpath("//input[@id='email']");
    private static final By acceptUserBtn = By.xpath("//button[@id='accept']");

    public AddUserPage fillFullNameField(String fullName) {
        findElement(fullNameField).sendKeys(fullName);
        return this;
    }

    public AddUserPage fillEmailField(String email) {
        findElement(emailField).sendKeys(email);
        return this;
    }
    public AddUserPage clickOnAcceptUserBtn() {
        waitUntilElementIsClickable(acceptUserBtn).click();
        return this;
    }
}

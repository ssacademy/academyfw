package org.academy.ui.pages;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;

public class SettingsPage extends AbstractPage {

    private static final By email = By.xpath("//input[@id='email']");

    public SettingsPage() { super(); }
    public SettingsPage(boolean navigate, String navigateToURL) {
        super(navigate, navigateToURL);
    }

    public String getEmail() {
        return this.findElement(email).getAttribute("value");
    }

    public String actualEmail() {
        return "ssacd2@mailforspam.com";
    }

    public SettingsPage checkEmail() {
        assertEquals(getEmail(), actualEmail(), "Invalid value of email in user's settings!");
        return this;
    }
}

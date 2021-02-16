package org.academy.ui.pages;

import org.openqa.selenium.By;

import java.util.Set;

public class SettingsPage extends AbstractPage {

    private static final By email = By.xpath("");

    public SettingsPage() { super(); }
    public SettingsPage(boolean navigate, String navigateToURL) {
        super(navigate, navigateToURL);
    }
}

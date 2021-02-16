package org.academy.ui.steps;

import lombok.extern.slf4j.Slf4j;
import org.academy.ui.pages.LoginPage;
import org.academy.ui.pages.MainPage;
import org.academy.utils.ui.WebConfig;

@Slf4j
public class LoginSteps {
    private MainPage mainPage;

    public MainPage makeLogin() {
        if (mainPage == null)
            mainPage = new LoginPage(true, WebConfig.getAccountUrl())
                    .fillLoginField(WebConfig.getLogin())
                    .fillPassField(WebConfig.getPassword())
                    .clickOnLoginButton();
        return mainPage;
    }
}

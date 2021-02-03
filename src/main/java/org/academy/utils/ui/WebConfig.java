package org.academy.utils.ui;

import org.academy.PropertyReader;

public class WebConfig {

    private static String read(String value) {
        return PropertyReader.get().readValue(value);
    }

    public static String getBrowser() {
        return read("ts.browser");
    }

    public static String getGurockUrl() {
        return read("ts.gurock_url");
    }

    public static String getAccountUrl() {
        return read("ts.account_url");
    }

    public static String getLogin() {
        return read("ts.user");
    }

    public static String getPassword() {
        return read("ts.password");
    }

    public static String navToPage(String pageName) {
        return read("ts.gurock_url") + read(pageName);
    }
}

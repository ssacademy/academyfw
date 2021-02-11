package org.academy.utils.ui.waiters;

import lombok.extern.slf4j.Slf4j;
import org.academy.utils.ui.LocalWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@Slf4j
public class WebWaiters {
    protected final WebDriver webDriver = LocalWebDriverManager.getWebDriver();
    private static final Integer timeForWaiting = 30;

    public WebElement findElement(By element) {
        return findElement(element, 30);
    }

    public WebElement findElement(By element, int defaultTimeout) {
        return new WebDriverWait(webDriver, defaultTimeout)
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitUntilElementIsVisible(WebElement webElement, int timeOutInSeconds) {
        return new WebDriverWait(webDriver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(webElement));
    }

    public WebElement waitUntilElementIsVisible(WebElement webElement) {
        return new WebDriverWait(webDriver, timeForWaiting).until(ExpectedConditions.visibilityOf(webElement));
    }

    public Boolean waitUntilElementIsInvisible(WebElement webElement) {
        return new WebDriverWait(webDriver, timeForWaiting).until(ExpectedConditions.invisibilityOf(webElement));
    }

    public WebElement waitUntilElementIsPresent(By element, int timeOutInSeconds) {
        return new WebDriverWait(webDriver, timeOutInSeconds).until(presenceOfElementLocated(element));
    }

    public WebElement waitUntilElementIsPresent(By element) {
        return new WebDriverWait(webDriver, timeForWaiting).until(presenceOfElementLocated(element));
    }

    public List<WebElement> waitUntilElementIsNotPresent(By element) {
        return new WebDriverWait(webDriver, timeForWaiting).until(ExpectedConditions.numberOfElementsToBe(element, 0));
    }

    public Alert waitUntilAlertPresent() {
        return new WebDriverWait(webDriver, timeForWaiting).until(ExpectedConditions.alertIsPresent());
    }

    public WebElement waitUntilElementIsClickable(By element) {
        return new WebDriverWait(webDriver, timeForWaiting).until(ExpectedConditions.elementToBeClickable(element));
    }
}

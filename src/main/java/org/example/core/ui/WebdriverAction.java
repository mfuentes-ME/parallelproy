package org.example.core.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverAction {

    private WebDriver driver;

    private WebDriverWait wait;

    public WebdriverAction(final WebDriver driver, final WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(final WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void click(final By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }

    public String getText(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    public String getText(final By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    public void setValue(final By selector, final String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        WebElement element = driver.findElement(selector);
        element.clear();
        element.sendKeys(value);
    }

    public void setValue(final WebElement webElement, final String value) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }
    public void clickPopup() {
        driver.switchTo().alert().accept();
    }

    public String getTextPopup() {
        return driver.switchTo().alert().getText();
    }

    public boolean isElementVisible(final By element) {
        try {
            driver.findElement(element);
        } catch (final NoSuchElementException e) {
            return false;
        }
        return true;
    }
}

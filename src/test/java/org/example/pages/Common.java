package org.example.pages;

//import org.hospitalproy.core.ui.AbstractPage;

import org.example.core.ui.AbstractPage;
import org.example.core.ui.DriverFactory;
import org.openqa.selenium.By;

public class Common extends AbstractPage {

    private static final String BUTTON_NAME = "//button[contains(text(),'%s')]";
    private static final String LINK = "//a[contains(@href,'%s')]";

    public void clickOnButton(final String buttonName) throws InterruptedException {
        Thread.sleep(1000);
        DriverFactory.getDriver().findElement(By.xpath(String.format(BUTTON_NAME, buttonName))).click();
    }

    public void clickLink(final String link) {
        DriverFactory.getDriver().findElement(By.xpath(String.format(LINK, link))).click();
    }
}

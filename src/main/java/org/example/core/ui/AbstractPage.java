package org.example.core.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    public static final int DEFAULT_IMPLICIT_TIMEOUT = 15;
    public static final int EXPLICIT_WAIT_IN_SECONDS = 20;

    protected WebDriver driver;

    protected WebDriverWait wait;

    protected static WebdriverAction action;

    private Map<String, By> locators = null;

    public AbstractPage(Map<String, By> locators) {
      this.locators = locators;
    }


    public AbstractPage() {
        this.driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT_IN_SECONDS);
        this.action = new WebdriverAction(driver, wait);
        PageFactory.initElements(driver, this);
    }


    public void FillFieldsFromCSV(String fileName) throws IOException {
        String line = "";
        String cvsSplitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader( "E:\\"+ fileName + ".csv"));
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(cvsSplitBy);
            WebElement element =  DriverFactory.getDriver().findElement(locators.get(fields[0]));
            element.clear();
            element.sendKeys(fields[1]);
        }
    }
}

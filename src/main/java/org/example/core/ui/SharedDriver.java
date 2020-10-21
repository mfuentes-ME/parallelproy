package org.example.core.ui;

import org.example.core.Environment;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver {
    private final int timeWait = 15;

    public SharedDriver() {
        if (DriverFactory.getDriver() == null) {
            WebDriver driver = BrowserFactory.getBrowser(Environment.getInstance().getValue("browser"));
            driver.manage().timeouts().implicitlyWait(timeWait, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            DriverFactory.addDriver(driver);
        }
    }
}

package org.example.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Docker extends AbstractBrowser {

    public static final String URL = "http://192.168.1.25:4444/wd/hub";

    @Override
    WebDriver init() {

        WebDriver driver = null;
        String browser = System.getProperty("browser");

        try {
            if (browser.toLowerCase().contains("firefox")) {
                return new RemoteWebDriver(new URL(URL), new FirefoxOptions());
            }
            if (browser.toLowerCase().contains("chrome")) {
                return new RemoteWebDriver(new URL(URL), new ChromeOptions());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

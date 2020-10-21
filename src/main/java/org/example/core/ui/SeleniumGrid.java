package org.example.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid extends AbstractBrowser {

    public static final String URL = "http://169.254.186.41:5555/wd/hub";


    @Override
    WebDriver init() {
//        chrome
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setVersion("84.0.4147.89");
//        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "chrome");
//        caps.setCapability("browser_version", "84.0.4147.89");
//        caps.setCapability("os", "WIN10");
//        caps.setCapability("os_version", "WIN10");
//firefox
//        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setVersion("78.0.2");
        caps.setCapability("marionette", true);


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

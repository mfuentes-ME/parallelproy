package org.example.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
//    WebDriver driver;
//    String baseURL, nodeURL;
//
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//
//        //chrome
////        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
////        baseURL = "http://demo.guru99.com/test/guru99home/";
////        nodeURL = "http://169.254.186.41:5555/wd/hub";
////        DesiredCapabilities capability = new DesiredCapabilities();
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("test-type");
////        options.addArguments("disable-extensions");
////        options.addArguments("--start-maximized");
////        capability.setCapability("chrome.binary", "C:\\WebDrivers\\chromedriver.exe");
////        capability.setVersion("84.0.4147.89");
////        capability.setCapability(ChromeOptions.CAPABILITY, options);
////        capability.setBrowserName("chrome");
////        driver = new RemoteWebDriver(new URL(nodeURL), capability);
//
////        firefox
////        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
//        DesiredCapabilities capability = new DesiredCapabilities();
//        capability.setVersion("78.0.2");
//        capability.setCapability("marionette", true);
//        driver = new RemoteWebDriver(new URL(nodeURL), capability);
//    }
//
//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
//
//    @Test
//    public void sampleTest() {
//        driver.get(baseURL);
//
//
//        if (driver.getPageSource().contains("MOBILE TESTING")) {
//            Assert.assertTrue(true, "Mobile Testing Link Found");
//        } else {
//            Assert.fail("Failed: Link not found");
//        }
//
//    }
//
//    @Test
//    public void sampleTest1() {
////        driver.get(baseURL);
////
////
////        if (driver.getPageSource().contains("MOBILE TESTING")) {
////            Assert.assertTrue(true, "Mobile Testing Link Found");
////        } else {
////            Assert.fail("Failed: Link not found");
////        }
////
//    }
}

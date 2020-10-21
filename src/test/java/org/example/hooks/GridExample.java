package org.example.hooks;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample {

//    @Test
//    public void mailTest() throws MalformedURLException, InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setBrowserName("chrome");
//        desiredCapabilities.setVersion("84.0.4147.89");
//        desiredCapabilities.setPlatform(Platform.WIN10);
//        WebDriver driver = new RemoteWebDriver(new URL("http://169.254.186.41:4444/wd/hub"),
//                desiredCapabilities);
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        System.out.println("Title of the page is " + driver.getTitle());
//        Thread.sleep(5000);
//        driver.quit();
//    }
//
//    @Test
//    public void mailTest1() throws MalformedURLException, InterruptedException {
////        firefox
//        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
//        DesiredCapabilities capability = new DesiredCapabilities();
//        capability.setVersion("78.0.2");
//        capability.setCapability("marionette", true);
////        driver = new RemoteWebDriver(new URL(nodeURL), capability);
//
//        WebDriver driver = new RemoteWebDriver(new URL("http://169.254.186.41:7777/wd/hub"),
//                capability);
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        System.out.println("Title of the page is " + driver.getTitle());
//        Thread.sleep(5000);
//        driver.quit();
//    }

}

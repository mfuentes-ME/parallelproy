package org.example.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridExample2 {
//    @Test
//    public void mailTest() throws MalformedURLException {
//        DesiredCapabilities dr = null;
//        String browserType = null;
//        if (browserType.equals("firefox")) {
//            dr = DesiredCapabilities.firefox();
//            dr.setBrowserName("firefox");
//            dr.setPlatform(Platform.WINDOWS);
//
//        } else {
//            dr = DesiredCapabilities.internetExplorer();
//            dr.setBrowserName("iexplore");
//            dr.setPlatform(Platform.WINDOWS);
//        }
//
//        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
//        driver.navigate().to("http://gmail.com");
//        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
//        driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
//        driver.close();
//    }
}

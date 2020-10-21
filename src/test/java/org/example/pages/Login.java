package org.example.pages;

//import org.hospitalproy.core.ui.AbstractPage;

import io.cucumber.java.hu.Ha;
import javafx.beans.binding.MapBinding;
import javafx.collections.ObservableMap;
import org.example.core.ui.AbstractPage;
import org.example.core.ui.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Login extends AbstractPage {

    @FindBy(xpath = "//a[contains(@href,'user')]")
    private WebElement loginPatient;

    @FindBy(xpath = "//a[contains(@href,'doctor')]")
    private WebElement loginDoctor;

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement passwordTextField1;

    @FindBy(name = "submit")
    private WebElement login;


    public Login() {
        super(locators);
    }

    private static final Map<String, By> locators;
    static {
        Map<String, By> myLocators = new HashMap<String, By>();
        myLocators.put("User Name", By.name("username") );
        myLocators.put("Password", By.name("password") );
        locators = myLocators;
    }

//    public void loginAs(final String userName, final String password, final String user) {
//        if (!driver.getTitle().contains("Dashboard")) {
//            if (user.equals("Doctor")) {
//                action.click(loginDoctor);
//            } else {
//                action.click(loginPatient);
//            }
//            action.setValue(username, userName);
//            action.setValue(passwordTextField1, password);
//            action.click(login);
//        }
//
//    }

    public void loginAs1(final String userName, final String password) {
        action.setValue(username, userName);
        action.setValue(passwordTextField1, password);
    }
}

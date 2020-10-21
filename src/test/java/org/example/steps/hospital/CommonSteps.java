package org.example.steps.hospital;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.example.core.Environment;
import org.example.core.ui.DriverFactory;
import org.example.core.ui.SharedDriver;
import org.example.pages.Login;
import org.example.pages.Common;
import org.example.pages.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class CommonSteps {

    private final Header header;
    private final Login login;
    private final Common common;
    private Logger log = Logger.getLogger(getClass());

    public CommonSteps(final SharedDriver sharedDriver, final Login login, final Common common, final Header header) {
        this.login = login;
        this.common = common;
        this.header = header;
    }
//
//    @Given("I login as {string}")
//    public void iSignInAsUserAnd(final String user) {
//        String userName = Environment.getInstance().getValue(String.format("$['credentials']['%s']['username']", user));
//        String password = Environment.getInstance().getValue(String.format("$['credentials']['%s']['password']", user));
//        login.loginAs(userName, password, user);
//    }

//    @Given("I sign in as {string} on {string} environment")
//    public void iSignInAsOnEnvironment(final String user, final String env) {
//        if (env.equals("qa1")) {
//            String qa1 = Environment.getInstance().getValue(String.format("$['environments']['%s']", env));
//            DriverFactory.getDriver().get(qa1);
//        } else {
//            String qa2 = Environment.getInstance().getValue(String.format("$['environments']['%s']", env));
//            DriverFactory.getDriver().get(qa2);
//        }
//
//        String userName = Environment.getInstance().getValue(String.format("$['credentials']['%s']['username']", user));
//        String password = Environment.getInstance().getValue(String.format("$['credentials']['%s']['password']", user));
//
//        login.loginAs(userName, password, user);
//    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(final String buttonName) throws InterruptedException {
//        DriverFactory.getDriver().findElement(By.name("submit")).click();
//        Thread.sleep(1000);
        common.clickOnButton(buttonName);
    }

    @And("I fill value from {string} csv on {string}")
    public void fillFromCSV(final String fileName, final String pageName) throws IOException {

        switch (pageName) {
            case "Login":
                new Login().FillFieldsFromCSV(fileName);
                break;
        }
    }

    @And("I should see the {string} updated on the header")
    public void iShouldSeeTheUpdatedOnTheHeader(final String doctorName) {
        assertEquals(header.getFieldValue(), doctorName);
    }

    @When("I enter the username {string} and password {string}")
    public void iEnterTheUsernameAndPassword(final String userName, final String password) throws
            InterruptedException {
        log.info("Set Login");
        Thread.sleep(1000);
        login.loginAs1(userName, password);
    }

    @Given("I click on {string} link")
    public void iClickOnLinkOnEnvironment(final String user) throws InterruptedException {
        log.info("Click on link");
        common.clickLink(user);
        Thread.sleep(1000);
    }

    @And("I go to Medical Portal")
    public void goToPOrtal() {
        log.info("Go to Portal");
        String env = System.getProperty("env");
        if (env == null)
            env = "qa1";
        String qa = Environment.getInstance().getValue(String.format("$['environments']['%s']", env));
        DriverFactory.getDriver().navigate().to(qa);
    }

    @Given("I sign in as {string}")
    public void iSignInAs(String user) {
        String userName = Environment.getInstance().getValue(String.format("$['credentials']['%s']['username']", user));
        String password = Environment.getInstance().getValue(String.format("$['credentials']['%s']['password']", user));
        login.loginAs1(userName, password);
    }
}

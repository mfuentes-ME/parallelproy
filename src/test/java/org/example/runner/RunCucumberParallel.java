package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/",
        glue = "org.example",
        plugin = {"pretty"}
)
public class RunCucumberParallel extends AbstractTestNGCucumberTests {

    @BeforeTest
    public void setUp() {
        PropertyConfigurator.configure("log.properties");
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @Test
    public void testName() {

    }

    @AfterTest
    public void tearDown() {
        // clean data
        // reset flags
    }

}

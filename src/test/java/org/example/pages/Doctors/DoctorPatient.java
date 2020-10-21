package org.example.pages.Doctors;

//import org.hospitalproy.core.ui.AbstractPage;
//import org.hospitalproy.core.ui.ISteps;
import org.example.core.ui.AbstractPage;
import org.example.core.ui.DriverFactory;
import org.example.core.ui.ISteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DoctorPatient extends AbstractPage {
    private static final String PATIENT_NAME = "//td[text()='%s']";
    private static final String SPAN_VALUE = "//th[text()='%s']/following::td[1]";
    private static final String EYE_ICON = PATIENT_NAME + "/ancestor::tr/td/a[contains(@href,'%s')]";
    private static final String HISTORY = "//input[@placeholder='%s']";

    @FindBy(xpath = "//span[contains(@style,'color:red')]")
    private WebElement visualMessage;

    @FindBy(xpath = "//input[@name='bp']")
    private WebElement bloodPresure;

    @FindBy(xpath = "//input[@name='bs']")
    private WebElement bloodSugar;

    @FindBy(xpath = "//input[@name='weight']")
    private WebElement weight;

    @FindBy(xpath = "//input[@name='temp']")
    private WebElement bodyTemp;

    @FindBy(xpath = "//textarea[@name='pres']")
    private WebElement prescription;

    public static String getFieldValue(final String label) {
        return DriverFactory.getDriver().findElement(By.xpath(String.format(SPAN_VALUE, label))).getText();
    }

    public boolean isPatientVisible(final String patientName) {
       return DriverFactory.getDriver().findElement(By.xpath(String.format(PATIENT_NAME, patientName))).isDisplayed();
    }

    public String getVisualMessage() {
        return action.getText(visualMessage);
    }

    public void clickEyeIcon(final String icon, final String patientName) {
        DriverFactory.getDriver().findElement(By.xpath(String.format(EYE_ICON, patientName, icon))).click();
    }

    public void createHistory(final Map<String, String> data) {
        Map<String, ISteps> strategyMap = new HashMap<>();
        strategyMap.put("Blood Pressure", () -> action.setValue(bloodPresure, data.get("Blood Pressure")));
        strategyMap.put("Blood Sugar", () -> action.setValue(bloodSugar, data.get("Blood Sugar")));
        strategyMap.put("Weight", () -> action.setValue(weight, data.get("Weight")));
        strategyMap.put("Body Temperature", () -> action.setValue(bodyTemp, data.get("Body Temperature")));
        strategyMap.put("Prescription", () -> action.setValue(prescription, data.get("Prescription")));

        Set<String> keys = data.keySet();
        for (String key : keys) {
            strategyMap.get(key).execute();
        }
    }
}

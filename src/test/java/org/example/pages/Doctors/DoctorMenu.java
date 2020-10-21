package org.example.pages.Doctors;

import org.example.core.ui.AbstractPage;
import org.example.core.ui.DriverFactory;
import org.example.core.ui.ISteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DoctorMenu extends AbstractPage {
    private static final String LINKMENU = "//div/span[contains(text(),'%s')]/parent::div/preceding-sibling::div/i";
    private static final String LINKSUBMENU = "//span[contains(text(),'%s')]";
    private static final String LINK = "//a[contains(text(),'%s')]";
    private static final String OPTION_SPECIALIZATION_XPATH =
            "//select[@name='Doctorspecialization']/option[@value='%s']";
    private static final String GENDER = "//input[@value='%s']/following::label";

    @FindBy(css = "#hardware_template_locationid_chooser")
    private WebElement locationSelect;

    @FindBy(xpath = "//select[@name='Doctorspecialization']")
    private WebElement specializationSelect;

    @FindBy(xpath = "//input[@name='docname']")
    private WebElement doctroNameTextField;

    @FindBy(xpath = "//textarea[@name='clinicaddress']")
    private WebElement clinicaddress;

    @FindBy(xpath = "//input[@name='docfees']")
    private WebElement docfees;

    @FindBy(xpath = "//input[@name='doccontact']")
    private WebElement doccontact;

    @FindBy(xpath = "//input[@name='docemail']")
    private WebElement docemail;

    @FindBy(css = "button[class='btn btn-o btn-primary']")
    private WebElement updateButton;


    @FindBy(xpath = "//input[@name='patname']")
    private WebElement patientName;


    @FindBy(xpath = "//input[@name='patcontact']")
    private WebElement patientContactNo;

    @FindBy(xpath = "//input[@name='patemail']")
    private WebElement patientEmail;

    @FindBy(xpath = "//textarea[@name='pataddress']")
    private WebElement patientAddr;

    @FindBy(xpath = "//input[@name='patage']")
    private WebElement patientAge;

    @FindBy(xpath = "//textarea[@name='medhis']")
    private WebElement patientHistory;


    public static String getMessageFromPopUp() {
        return action.getTextPopup();
    }

    public static void acceptPopup() {
        action.clickPopup();
    }


    public void clickOnLinkMenu(final String link) {
        DriverFactory.getDriver().findElement(By.xpath(String.format(LINKMENU, link))).click();
    }

    public void clickOnLink(final String link) {
        action.click(By.xpath(String.format(LINK, link)));
    }

    public void updateProfile(final Map<String, String> data) {
        Map<String, ISteps> strategyMap = new HashMap<>();
        strategyMap.put("doctor_specialization", () -> selectSpecialization(data.get("doctor_specialization")));
        strategyMap.put("doctor_name", () -> action.setValue(doctroNameTextField, data.get("doctor_name")));
        strategyMap.put("doctor_clinic_address", () -> action.setValue(clinicaddress,
                data.get("doctor_clinic_address")));
        strategyMap.put("doctor_consultancy_fees", () -> action.setValue(docfees, data.get("doctor_consultancy_fees")));
        strategyMap.put("doctor_contact_no", () -> action.setValue(doccontact, data.get("doctor_contact_no")));

        Set<String> keys = data.keySet();
        for (String key : keys) {
            strategyMap.get(key).execute();
        }

//        action.click(updateButton);
    }


    private void selectSpecialization(final String doctorSpecialization) {
        action.click(specializationSelect);
        String optionSelectSpecialization = String.format(OPTION_SPECIALIZATION_XPATH, doctorSpecialization);
        action.click(By.xpath(optionSelectSpecialization));
    }


    public void createPatient(final Map<String, String> data) {
        Map<String, ISteps> strategyMap = new HashMap<>();
        strategyMap.put("Patient Name", () -> action.setValue(patientName, data.get("Patient Name")));
        strategyMap.put("Patient Contact no", () -> action.setValue(patientContactNo, data.get("Patient Contact no")));
        strategyMap.put("Patient Email", () -> action.setValue(patientEmail, data.get("Patient Email")));
        strategyMap.put("Gender", () -> action.click(By.xpath(String.format(GENDER, data.get("Gender")))));
        strategyMap.put("Patient Address", () -> action.setValue(patientAddr, data.get("Patient Address")));
        strategyMap.put("Patient Age", () -> action.setValue(patientAge, data.get("Patient Age")));
        strategyMap.put("Medical History", () -> action.setValue(patientHistory, data.get("Medical History")));

        Set<String> keys = data.keySet();
        for (String key : keys) {
            strategyMap.get(key).execute();
        }

    }

    public void clickOnLinkSubMenu(final String link) {
        DriverFactory.getDriver().findElement(By.xpath(String.format(LINKSUBMENU, link))).click();
    }
}

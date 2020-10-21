package org.example.steps.hospital.Doctors;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.core.ui.SharedDriver;
import org.example.pages.Doctors.DoctorMenu;
import org.example.pages.Doctors.DoctorPatient;

import java.util.Map;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import org.hospitalproy.core.ui.SharedDriver;
//import org.hospitalproy.pages.Doctors.DoctorMenu;
//import org.hospitalproy.pages.Doctors.DoctorPatient;

public class DoctorSteps {
    private final DoctorMenu doctorMenu;
    private final DoctorPatient doctorPatient;


    public DoctorSteps(final SharedDriver sharedDriver,
                       final DoctorMenu doctorMenu, final DoctorPatient doctorPatient) {
        this.doctorMenu = doctorMenu;
        this.doctorPatient = doctorPatient;
    }

    @And("I click on the {string} link from menu")
    public void iClickOnTheLinkMenu(final String link) throws InterruptedException {
        Thread.sleep(1000);
        doctorMenu.clickOnLinkMenu(link);
    }

    @And("I click on the {string} link")
    public void iClickOnTheLink(final String link) throws InterruptedException {
        Thread.sleep(1000);
        doctorMenu.clickOnLink(link);
    }

    @And("I edit the Profile with:")
    public void iEditTheTheProfileWith(final Map<String, String> data) {
        doctorMenu.updateProfile(data);

    }

    @Then("I should see the {string} message")
    public void iShouldSeeTheMessage(final String message) {
        assertEquals(message, DoctorMenu.getMessageFromPopUp());
        DoctorMenu.acceptPopup();
    }

    @And("I add the Add Patient form with:")
    public void iAddTheAddPatientFormWith(final Map<String, String> data) {
        doctorMenu.createPatient(data);
    }

    @Then("I validate the new patient {string} is in Manage Patients list")
    public void iValidateTheNewPatientIsInManagePatientsList(final String patientName) {
        assertTrue(doctorPatient.isPatientVisible(patientName));
    }

    @Then("I validate the following message is displayed {string}")
    public void iValidateTheFollowingMessageIsDisplayedEmailAlreadyExists(final String message) {
        assertEquals(doctorPatient.getVisualMessage(), message);
    }

    @And("I validate the new patient details are")
    public void iValidateTheNewPatientDetailsAre(final Map<String, String> data) {
        Set<String> keys = data.keySet();
        for (String key : keys) {
            assertEquals(DoctorPatient.getFieldValue(key), data.get(key), "Actual :" + DoctorPatient.getFieldValue(key) + " Expect :" + data.get(key));
        }
    }

    @And("I click on {string} icon of patient {string}")
    public void iClickOnIconOfPatient(final String icon, final String patientName) {
        doctorPatient.clickEyeIcon(icon, patientName);
    }

    @And("I add Medical History form with:")
    public void iAddMedicalHistoryFormWith(final Map<String, String> data) {
        doctorPatient.createHistory(data);
    }

    @And("I click on the {string} link from submenu")
    public void iClickOnTheLinkFromSubmenu(final String link) {
        doctorMenu.clickOnLinkSubMenu(link);
    }
}

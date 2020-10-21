@parallel
Feature: Doctor Patients history

  @Marcuss
  Scenario Outline: Add Patient history
    Given I go to Medical Portal
    And I click on "doctor" link
    When I fill value from "LoginLocator" csv on "Login"
    And I click on the "Login" button
    And I click on the "Patients" link from menu
    And I click on the "Add Patient" link from submenu
    And I add the Add Patient form with:
      | Patient Name       | <patient_name>       |
      | Patient Contact no | <patient_contact_no> |
      | Patient Email      | <patient_email>      |
      | Gender             | <gender>             |
      | Patient Address    | <patient_address>    |
      | Patient Age        | <patient_age>        |
      | Medical History    | <patient_history>    |
    And I click on the "Add" button
    And I click on the "Patients" link from menu
    And I click on the "Manage Patient" link from submenu
    And I click on "view" icon of patient "<patient_name>"
    When I click on the "Add Medical History" button
    And I add Medical History form with:
      | Blood Pressure   | <Blood Pressure>   |
      | Blood Sugar      | <Blood Sugar>      |
      | Weight           | <Weight>           |
      | Body Temperature | <Body Temperature> |
      | Prescription     | <Prescription>     |
    And I click on the "Submit" button
    Then I should see the "Medicle history has been added." message
    Examples:

      | patient_name | patient_contact_no | patient_email     | gender | patient_address | patient_age | patient_history     | Blood Pressure | Blood Sugar | Weight | Body Temperature | Prescription        |
      | patient1     | 2523523523         | patient24@test.com | male   | test #5353      | 30          | This is only a test | 140            | 110         | 90     | 27               | This is only a test |






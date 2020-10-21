Feature: Doctor Patients history

  Scenario Outline: Add Patient history
    Given I sign in as "Doctor" on "qa1" environment
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
    When I click on "edit" icon of patient "<patient_name>"
#    And I update the patient form with:
#      | Patient Name       | <patient_name>       |
#      | Patient Contact no | <patient_contact_no> |
#      | Patient Email      | <patient_email>      |
#      | Patient Gender     | <gender>             |
#      | Patient Address    | <patient_address>    |
#      | Patient Age        | <patient_age>        |
#      | Medical History    | <patient_history>    |
#    And I click on the "Update" button
#    Then I validate the new patient details are
#      | Patient Name       | <patient_name>       |
#      | Patient Contact no | <patient_contact_no> |
#      | Patient Email      | <patient_email>      |
#      | Patient Gender     | <gender>             |
#      | Patient Address    | <patient_address>    |
#      | Patient Age        | <patient_age>        |
#      | Medical History    | <patient_history>    |
    Examples:

      | patient_name | patient_contact_no | patient_email  | gender | patient_address | patient_age | patient_history     |
      | Iruka Misake | 2523523523         | iruka@test.com | male   | test #5353      | 30          | This is only a test |






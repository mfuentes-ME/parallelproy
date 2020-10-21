@parallel
Feature: Doctor Patients

  Background:
    Given I go to Medical Portal
    And I click on "doctor" link
    When I fill value from "LoginLocator" csv on "Login"
    And I click on the "Login" button
    And I click on the "Patients" link from menu
    And I click on the "Add Patient" link from submenu

  @Marcuss
  Scenario Outline: Add Patient with valid data
    When I add the Add Patient form with:
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
    Then I validate the new patient "<patient_name>" is in Manage Patients list
    And I click on "view" icon of patient "<patient_name>"
    And I validate the new patient details are
      | Patient Name                    | <patient_name>       |
      | Patient Mobile Number           | <patient_contact_no> |
      | Patient Email                   | <patient_email>      |
      | Patient Address                 | <patient_address>    |
      | Patient Age                     | <patient_age>        |
      | Patient Medical History(if any) | <patient_history>    |

    Examples:
      | patient_name | patient_contact_no | patient_email     | gender | patient_address | patient_age | patient_history     |
      | Maris1       | 2523523523         | patito52@test.com | female | test #5353      | 30          | This is only a test |


  Scenario: Add Patient with existing patient email
    When I add the Add Patient form with:
      | Patient Name       | Paty Pato           |
      | Patient Contact no | 2523523523          |
      | Patient Email      | john@test.com       |
      | Gender             | female              |
      | Patient Address    | test #5353          |
      | Patient Age        | 30                  |
      | Medical History    | This is only a test |
    Then I validate the following message is displayed 'Email already exists .'

#@parallel
Feature: Login

  //@cleanData

  Scenario: Update doctor profile
    Given I sign in as "Doctor" on "qa1" environment
    And I click on the "Dashboard" link from menu
    When I click on the "Update Profile" link
    And I edit the Profile with:
      | doctor_specialization   | Dermatologist           |
      | doctor_name             | Keilly Fuentes Salguero |
      | doctor_clinic_address   | Test updated            |
      | doctor_consultancy_fees | 100                     |
      | doctor_contact_no       | 123456789               |
    And I click on the "Update" button
    Then I should see the "Doctor Details updated Successfully" message
    And I should see the "Keilly Fuentes Salguero" updated on the header
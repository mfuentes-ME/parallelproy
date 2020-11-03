#@parallel
Feature: Login


  Scenario: Hospital login
    Given I go to Medical Portal
    And I click on "user" link
    And I click on the "Login" button
    And I click on the "Patients" link from menu


#  @LoginLocatorCSV
#  Scenario: Hospital login with CVS
#    Given I go to Medical Portal
#    And I click on "doctor" link
#    When I fill value from "LoginLocator" csv on "Login"
#    And I click on the "Login" button



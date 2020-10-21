@parallel
Feature: Login

  Scenario: Hospital login
    Given I go to Medical Portal
    And I click on "doctor" link
    When I enter the username "test@demo.com" and password "Test@123"
    And I click on the "Login" button

  @LoginLocatorCSV
  Scenario: Hospital login with CVS
    Given I go to Medical Portal
    And I click on "doctor" link
    When I fill value from "LoginLocator" csv on "Login"
    And I click on the "Login" button

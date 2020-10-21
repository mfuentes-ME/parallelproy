#@parallel @marco
#@parallel
Feature: Login

  Background:
    Given  I go to Medical Potal
    And I click on "doctor" link on "qa1" environment

  Scenario: Hospital login valid data1
    When I enter the username "test@demo.com" and password "Test@123"
    And I click on the "Login" button
#    And I logOut

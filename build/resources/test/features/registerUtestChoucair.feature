#Author: Carlos Martínez
@stories

Feature: Utest User Registration
  As a user, I want to register on the Utest platform

  @scenario

  Scenario: Register on Utest

    Given the Utest website we look for the Join Today registration
      | strFirstName | strLastName |
      |   Mario      | Gonzalez    |
    When you enter this section you fill in the required information and save
      | strFirstName | strLastName |
      |   Mario      | Gonzalez    |
    Then this stores the user to then be able to access and use the services of the platform
      | strFirstName | strLastName |
      |   Mario      | Gonzalez    |